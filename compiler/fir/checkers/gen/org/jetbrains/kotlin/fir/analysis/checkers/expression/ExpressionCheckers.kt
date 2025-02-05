/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.analysis.checkers.expression

import org.jetbrains.kotlin.fir.analysis.CheckersComponentInternal

/*
 * This file was generated automatically
 * DO NOT MODIFY IT MANUALLY
 */

abstract class ExpressionCheckers {
    companion object {
        val EMPTY: ExpressionCheckers = object : ExpressionCheckers() {}
    }

    open val basicExpressionCheckers: Set<FirBasicExpressionChecker> = emptySet()
    open val qualifiedAccessCheckers: Set<FirQualifiedAccessChecker> = emptySet()
    open val functionCallCheckers: Set<FirFunctionCallChecker> = emptySet()
    open val variableAssignmentCheckers: Set<FirVariableAssignmentChecker> = emptySet()
    open val tryExpressionCheckers: Set<FirTryExpressionChecker> = emptySet()
    open val whenExpressionCheckers: Set<FirWhenExpressionChecker> = emptySet()
    open val returnExpressionCheckers: Set<FirReturnExpressionChecker> = emptySet()
    open val blockCheckers: Set<FirBlockChecker> = emptySet()

    @CheckersComponentInternal internal val allBasicExpressionCheckers: Set<FirBasicExpressionChecker> get() = basicExpressionCheckers
    @CheckersComponentInternal internal val allQualifiedAccessCheckers: Set<FirQualifiedAccessChecker> get() = qualifiedAccessCheckers + basicExpressionCheckers
    @CheckersComponentInternal internal val allFunctionCallCheckers: Set<FirFunctionCallChecker> get() = functionCallCheckers + qualifiedAccessCheckers + basicExpressionCheckers
    @CheckersComponentInternal internal val allVariableAssignmentCheckers: Set<FirVariableAssignmentChecker> get() = variableAssignmentCheckers + basicExpressionCheckers
    @CheckersComponentInternal internal val allTryExpressionCheckers: Set<FirTryExpressionChecker> get() = tryExpressionCheckers + basicExpressionCheckers
    @CheckersComponentInternal internal val allWhenExpressionCheckers: Set<FirWhenExpressionChecker> get() = whenExpressionCheckers + basicExpressionCheckers
    @CheckersComponentInternal internal val allReturnExpressionCheckers: Set<FirReturnExpressionChecker> get() = returnExpressionCheckers + basicExpressionCheckers
    @CheckersComponentInternal internal val allBlockCheckers: Set<FirBlockChecker> get() = blockCheckers + basicExpressionCheckers
}
