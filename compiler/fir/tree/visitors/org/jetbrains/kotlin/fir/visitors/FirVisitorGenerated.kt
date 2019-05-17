/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */
package org.jetbrains.kotlin.fir.visitors

import org.jetbrains.kotlin.fir.*
import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.declarations.impl.*
import org.jetbrains.kotlin.fir.expressions.*
import org.jetbrains.kotlin.fir.expressions.impl.*
import org.jetbrains.kotlin.fir.types.*


/** This file generated by :compiler:fir:tree:generateVisitors. DO NOT MODIFY MANUALLY! */
abstract class FirVisitor<out R, in D> {
    abstract fun visitElement(element: FirElement, data: D): R

    open fun visitCatch(catch: FirCatch, data: D): R {
        return visitElement(catch, data)
    }

    open fun visitDeclaration(declaration: FirDeclaration, data: D): R {
        return visitElement(declaration, data)
    }

    open fun visitCallableDeclaration(callableDeclaration: FirCallableDeclaration, data: D): R {
        return visitDeclaration(callableDeclaration, data)
    }

    open fun visitCallableMemberDeclaration(callableMemberDeclaration: FirCallableMemberDeclaration, data: D): R {
        return visitDeclaration(callableMemberDeclaration, data)
    }

    open fun visitDeclarationWithBody(declarationWithBody: FirDeclarationWithBody, data: D): R {
        return visitDeclaration(declarationWithBody, data)
    }

    open fun visitAnonymousInitializer(anonymousInitializer: FirAnonymousInitializer, data: D): R {
        return visitDeclarationWithBody(anonymousInitializer, data)
    }

    open fun visitFunction(function: FirFunction, data: D): R {
        return visitDeclarationWithBody(function, data)
    }

    open fun visitAnonymousFunction(anonymousFunction: FirAnonymousFunction, data: D): R {
        return visitFunction(anonymousFunction, data)
    }

    open fun visitConstructor(constructor: FirConstructor, data: D): R {
        return visitFunction(constructor, data)
    }

    open fun visitModifiableFunction(modifiableFunction: FirModifiableFunction, data: D): R {
        return visitFunction(modifiableFunction, data)
    }

    open fun visitNamedFunction(namedFunction: FirNamedFunction, data: D): R {
        return visitFunction(namedFunction, data)
    }

    open fun visitPropertyAccessor(propertyAccessor: FirPropertyAccessor, data: D): R {
        return visitFunction(propertyAccessor, data)
    }

    open fun visitErrorDeclaration(errorDeclaration: FirErrorDeclaration, data: D): R {
        return visitDeclaration(errorDeclaration, data)
    }

    open fun visitField(field: FirField, data: D): R {
        return visitDeclaration(field, data)
    }

    open fun visitNamedDeclaration(namedDeclaration: FirNamedDeclaration, data: D): R {
        return visitDeclaration(namedDeclaration, data)
    }

    open fun visitMemberDeclaration(memberDeclaration: FirMemberDeclaration, data: D): R {
        return visitNamedDeclaration(memberDeclaration, data)
    }

    open fun visitClassLikeDeclaration(classLikeDeclaration: FirClassLikeDeclaration, data: D): R {
        return visitMemberDeclaration(classLikeDeclaration, data)
    }

    open fun visitRegularClass(regularClass: FirRegularClass, data: D): R {
        return visitClassLikeDeclaration(regularClass, data)
    }

    open fun visitEnumEntry(enumEntry: FirEnumEntry, data: D): R {
        return visitRegularClass(enumEntry, data)
    }

    open fun visitTypeAlias(typeAlias: FirTypeAlias, data: D): R {
        return visitClassLikeDeclaration(typeAlias, data)
    }

    open fun visitTypeParameter(typeParameter: FirTypeParameter, data: D): R {
        return visitNamedDeclaration(typeParameter, data)
    }

    open fun visitProperty(property: FirProperty, data: D): R {
        return visitDeclaration(property, data)
    }

    open fun visitTypedDeclaration(typedDeclaration: FirTypedDeclaration, data: D): R {
        return visitDeclaration(typedDeclaration, data)
    }

    open fun visitValueParameter(valueParameter: FirValueParameter, data: D): R {
        return visitDeclaration(valueParameter, data)
    }

    open fun visitVariable(variable: FirVariable, data: D): R {
        return visitDeclaration(variable, data)
    }

    open fun visitDeclarationStatus(declarationStatus: FirDeclarationStatus, data: D): R {
        return visitElement(declarationStatus, data)
    }

    open fun visitResolvedDeclarationStatus(resolvedDeclarationStatus: FirResolvedDeclarationStatus, data: D): R {
        return visitDeclarationStatus(resolvedDeclarationStatus, data)
    }

    open fun visitImport(import: FirImport, data: D): R {
        return visitElement(import, data)
    }

    open fun visitResolvedImport(resolvedImport: FirResolvedImport, data: D): R {
        return visitImport(resolvedImport, data)
    }

    open fun visitLabel(label: FirLabel, data: D): R {
        return visitElement(label, data)
    }

    open fun visitPackageFragment(packageFragment: FirPackageFragment, data: D): R {
        return visitElement(packageFragment, data)
    }

    open fun visitFile(file: FirFile, data: D): R {
        return visitPackageFragment(file, data)
    }

    open fun visitReference(reference: FirReference, data: D): R {
        return visitElement(reference, data)
    }

    open fun visitNamedReference(namedReference: FirNamedReference, data: D): R {
        return visitReference(namedReference, data)
    }

    open fun visitResolvedCallableReference(resolvedCallableReference: FirResolvedCallableReference, data: D): R {
        return visitNamedReference(resolvedCallableReference, data)
    }

    open fun visitSuperReference(superReference: FirSuperReference, data: D): R {
        return visitReference(superReference, data)
    }

    open fun visitThisReference(thisReference: FirThisReference, data: D): R {
        return visitReference(thisReference, data)
    }

    open fun visitStatement(statement: FirStatement, data: D): R {
        return visitElement(statement, data)
    }

    open fun visitClass(klass: FirClass, data: D): R {
        return visitStatement(klass, data)
    }

    open fun visitAnonymousObject(anonymousObject: FirAnonymousObject, data: D): R {
        return visitClass(anonymousObject, data)
    }

    open fun visitModifiableClass(modifiableClass: FirModifiableClass, data: D): R {
        return visitClass(modifiableClass, data)
    }

    open fun visitErrorStatement(errorStatement: FirErrorStatement, data: D): R {
        return visitStatement(errorStatement, data)
    }

    open fun visitExpression(expression: FirExpression, data: D): R {
        return visitStatement(expression, data)
    }

    open fun visitBlock(block: FirBlock, data: D): R {
        return visitExpression(block, data)
    }

    open fun visitCall(call: FirCall, data: D): R {
        return visitExpression(call, data)
    }

    open fun visitAnnotationCall(annotationCall: FirAnnotationCall, data: D): R {
        return visitCall(annotationCall, data)
    }

    open fun visitArrayOfCall(arrayOfCall: FirArrayOfCall, data: D): R {
        return visitCall(arrayOfCall, data)
    }

    open fun visitArraySetCall(arraySetCall: FirArraySetCall, data: D): R {
        return visitCall(arraySetCall, data)
    }

    open fun visitDelegatedConstructorCall(delegatedConstructorCall: FirDelegatedConstructorCall, data: D): R {
        return visitCall(delegatedConstructorCall, data)
    }

    open fun visitFunctionCall(functionCall: FirFunctionCall, data: D): R {
        return visitCall(functionCall, data)
    }

    open fun visitComponentCall(componentCall: FirComponentCall, data: D): R {
        return visitFunctionCall(componentCall, data)
    }

    open fun visitGetClassCall(getClassCall: FirGetClassCall, data: D): R {
        return visitCall(getClassCall, data)
    }

    open fun visitOperatorCall(operatorCall: FirOperatorCall, data: D): R {
        return visitCall(operatorCall, data)
    }

    open fun visitTypeOperatorCall(typeOperatorCall: FirTypeOperatorCall, data: D): R {
        return visitOperatorCall(typeOperatorCall, data)
    }

    open fun visitStringConcatenationCall(stringConcatenationCall: FirStringConcatenationCall, data: D): R {
        return visitCall(stringConcatenationCall, data)
    }

    open fun visitUncheckedNotNullCast(uncheckedNotNullCast: FirUncheckedNotNullCast, data: D): R {
        return visitCall(uncheckedNotNullCast, data)
    }

    open fun visitClassReferenceExpression(classReferenceExpression: FirClassReferenceExpression, data: D): R {
        return visitExpression(classReferenceExpression, data)
    }

    open fun <T> visitConstExpression(constExpression: FirConstExpression<T>, data: D): R {
        return visitExpression(constExpression, data)
    }

    open fun visitErrorExpression(errorExpression: FirErrorExpression, data: D): R {
        return visitExpression(errorExpression, data)
    }

    open fun <E : FirTargetElement> visitJump(jump: FirJump<E>, data: D): R {
        return visitExpression(jump, data)
    }

    open fun visitBreakExpression(breakExpression: FirBreakExpression, data: D): R {
        return visitJump(breakExpression, data)
    }

    open fun visitContinueExpression(continueExpression: FirContinueExpression, data: D): R {
        return visitJump(continueExpression, data)
    }

    open fun visitReturnExpression(returnExpression: FirReturnExpression, data: D): R {
        return visitJump(returnExpression, data)
    }

    open fun visitResolvedQualifier(resolvedQualifier: FirResolvedQualifier, data: D): R {
        return visitExpression(resolvedQualifier, data)
    }

    open fun visitThrowExpression(throwExpression: FirThrowExpression, data: D): R {
        return visitExpression(throwExpression, data)
    }

    open fun visitTryExpression(tryExpression: FirTryExpression, data: D): R {
        return visitExpression(tryExpression, data)
    }

    open fun visitWhenExpression(whenExpression: FirWhenExpression, data: D): R {
        return visitExpression(whenExpression, data)
    }

    open fun visitWhenSubjectExpression(whenSubjectExpression: FirWhenSubjectExpression, data: D): R {
        return visitExpression(whenSubjectExpression, data)
    }

    open fun visitWrappedArgumentExpression(wrappedArgumentExpression: FirWrappedArgumentExpression, data: D): R {
        return visitExpression(wrappedArgumentExpression, data)
    }

    open fun visitLambdaArgumentExpression(lambdaArgumentExpression: FirLambdaArgumentExpression, data: D): R {
        return visitWrappedArgumentExpression(lambdaArgumentExpression, data)
    }

    open fun visitNamedArgumentExpression(namedArgumentExpression: FirNamedArgumentExpression, data: D): R {
        return visitWrappedArgumentExpression(namedArgumentExpression, data)
    }

    open fun visitLoop(loop: FirLoop, data: D): R {
        return visitStatement(loop, data)
    }

    open fun visitDoWhileLoop(doWhileLoop: FirDoWhileLoop, data: D): R {
        return visitLoop(doWhileLoop, data)
    }

    open fun visitWhileLoop(whileLoop: FirWhileLoop, data: D): R {
        return visitLoop(whileLoop, data)
    }

    open fun visitQualifiedAccess(qualifiedAccess: FirQualifiedAccess, data: D): R {
        return visitStatement(qualifiedAccess, data)
    }

    open fun visitAssignment(assignment: FirAssignment, data: D): R {
        return visitQualifiedAccess(assignment, data)
    }

    open fun visitVariableAssignment(variableAssignment: FirVariableAssignment, data: D): R {
        return visitAssignment(variableAssignment, data)
    }

    open fun visitModifiableQualifiedAccess(modifiableQualifiedAccess: FirModifiableQualifiedAccess, data: D): R {
        return visitQualifiedAccess(modifiableQualifiedAccess, data)
    }

    open fun visitQualifiedAccessExpression(qualifiedAccessExpression: FirQualifiedAccessExpression, data: D): R {
        return visitQualifiedAccess(qualifiedAccessExpression, data)
    }

    open fun visitCallableReferenceAccess(callableReferenceAccess: FirCallableReferenceAccess, data: D): R {
        return visitQualifiedAccessExpression(callableReferenceAccess, data)
    }

    open fun visitTargetElement(targetElement: FirTargetElement, data: D): R {
        return visitElement(targetElement, data)
    }

    open fun visitLabeledElement(labeledElement: FirLabeledElement, data: D): R {
        return visitTargetElement(labeledElement, data)
    }

    open fun visitTypeProjection(typeProjection: FirTypeProjection, data: D): R {
        return visitElement(typeProjection, data)
    }

    open fun visitStarProjection(starProjection: FirStarProjection, data: D): R {
        return visitTypeProjection(starProjection, data)
    }

    open fun visitTypeProjectionWithVariance(typeProjectionWithVariance: FirTypeProjectionWithVariance, data: D): R {
        return visitTypeProjection(typeProjectionWithVariance, data)
    }

    open fun visitTypeRef(typeRef: FirTypeRef, data: D): R {
        return visitElement(typeRef, data)
    }

    open fun visitDelegatedTypeRef(delegatedTypeRef: FirDelegatedTypeRef, data: D): R {
        return visitTypeRef(delegatedTypeRef, data)
    }

    open fun visitImplicitTypeRef(implicitTypeRef: FirImplicitTypeRef, data: D): R {
        return visitTypeRef(implicitTypeRef, data)
    }

    open fun visitResolvedTypeRef(resolvedTypeRef: FirResolvedTypeRef, data: D): R {
        return visitTypeRef(resolvedTypeRef, data)
    }

    open fun visitErrorTypeRef(errorTypeRef: FirErrorTypeRef, data: D): R {
        return visitResolvedTypeRef(errorTypeRef, data)
    }

    open fun visitResolvedFunctionTypeRef(resolvedFunctionTypeRef: FirResolvedFunctionTypeRef, data: D): R {
        return visitResolvedTypeRef(resolvedFunctionTypeRef, data)
    }

    open fun visitTypeRefWithNullability(typeRefWithNullability: FirTypeRefWithNullability, data: D): R {
        return visitTypeRef(typeRefWithNullability, data)
    }

    open fun visitDynamicTypeRef(dynamicTypeRef: FirDynamicTypeRef, data: D): R {
        return visitTypeRefWithNullability(dynamicTypeRef, data)
    }

    open fun visitFunctionTypeRef(functionTypeRef: FirFunctionTypeRef, data: D): R {
        return visitTypeRefWithNullability(functionTypeRef, data)
    }

    open fun visitUserTypeRef(userTypeRef: FirUserTypeRef, data: D): R {
        return visitTypeRefWithNullability(userTypeRef, data)
    }

    open fun visitWhenBranch(whenBranch: FirWhenBranch, data: D): R {
        return visitElement(whenBranch, data)
    }

}
