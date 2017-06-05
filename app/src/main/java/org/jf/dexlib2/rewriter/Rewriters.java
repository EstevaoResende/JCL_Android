/*
 * Copyright 2014, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.jf.dexlib2.rewriter;

import org.jf.dexlib2.iface.*;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.value.EncodedValue;



public interface Rewriters {
     Rewriter<ClassDef> getClassDefRewriter();
     Rewriter<Field> getFieldRewriter();

     Rewriter<Method> getMethodRewriter();
     Rewriter<MethodParameter> getMethodParameterRewriter();
     Rewriter<MethodImplementation> getMethodImplementationRewriter();
     Rewriter<Instruction> getInstructionRewriter();
     Rewriter<TryBlock<? extends ExceptionHandler>> getTryBlockRewriter();
     Rewriter<ExceptionHandler> getExceptionHandlerRewriter();
     Rewriter<DebugItem> getDebugItemRewriter();

     Rewriter<String> getTypeRewriter();
     Rewriter<FieldReference> getFieldReferenceRewriter();
     Rewriter<MethodReference> getMethodReferenceRewriter();

     Rewriter<Annotation> getAnnotationRewriter();
     Rewriter<AnnotationElement> getAnnotationElementRewriter();

     Rewriter<EncodedValue> getEncodedValueRewriter();
}
