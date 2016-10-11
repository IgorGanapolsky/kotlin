/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.analyze

import org.jetbrains.kotlin.config.LanguageVersionSettingsImpl
import org.jetbrains.kotlin.context.ContextForNewModule
import org.jetbrains.kotlin.context.ModuleContext
import org.jetbrains.kotlin.descriptors.PackageFragmentProvider
import org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl
import org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs
import org.jetbrains.kotlin.js.analyzer.JsAnalysisResult
import org.jetbrains.kotlin.js.config.JsConfig
import org.jetbrains.kotlin.js.resolve.JsPlatform
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.resolve.*
import org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory
import java.util.*

object TopDownAnalyzerFacadeForJS {
    @JvmStatic
    fun analyzeFiles(files: Collection<KtFile>, config: JsConfig): JsAnalysisResult {
        val trace = BindingTraceContext()

        val newModuleContext = ContextForNewModule(
                config.project, Name.special("<" + config.moduleId + ">"), JsPlatform
        )
        newModuleContext.setDependencies(computeDependencies(newModuleContext.module, config))
        return analyzeFilesWithGivenTrace(files, trace, newModuleContext, config)
    }

    private fun computeDependencies(module: ModuleDescriptorImpl, config: JsConfig): List<ModuleDescriptorImpl> {
        val allDependencies = ArrayList<ModuleDescriptorImpl>()
        allDependencies.add(module)
        for (descriptor in config.moduleDescriptors) {
            allDependencies.add(descriptor.data)
        }
        allDependencies.add(JsPlatform.builtIns.builtInsModule)
        return allDependencies
    }

    @JvmStatic
    fun analyzeFilesWithGivenTrace(
            files: Collection<KtFile>,
            trace: BindingTrace,
            moduleContext: ModuleContext,
            config: JsConfig
    ): JsAnalysisResult {
        val allFiles = JsConfig.withJsLibAdded(files, config)

        val analyzerForJs = createTopDownAnalyzerForJs(
                moduleContext, trace,
                FileBasedDeclarationProviderFactory(moduleContext.storageManager, allFiles),
                LanguageVersionSettingsImpl.DEFAULT
        )
        analyzerForJs.analyzeFiles(TopDownAnalysisMode.TopLevelDeclarations, files, emptyList<PackageFragmentProvider>())
        return JsAnalysisResult.success(trace, moduleContext.module)
    }

    @JvmStatic
    fun checkForErrors(allFiles: Collection<KtFile>, bindingContext: BindingContext) {
        AnalyzingUtils.throwExceptionOnErrors(bindingContext)
        for (file in allFiles) {
            AnalyzingUtils.checkForSyntacticErrors(file)
        }
    }
}
