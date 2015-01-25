/*
 * Javassist, a Java-bytecode translator toolkit.
 * Copyright (C) 1999-2006 Shigeru Chiba. All Rights Reserved.
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License.  Alternatively, the contents of this file may be used under
 * the terms of the GNU Lesser General Public License Version 2.1 or later.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 */

package javassist.convert;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.Modifier;
import javassist.bytecode.*;

public class TransformCall extends Transformer {
    protected String classname, methodname, methodDescriptor;
    protected String newClassname, newMethodname;
    protected boolean newMethodIsPrivate;

    /* cache */
    protected int newIndex;
    protected ConstPool constPool;

    public TransformCall(Transformer next, CtMethod origMethod,
                         CtMethod substMethod)
    {
        this(next, origMethod.getName(), substMethod);
        classname = origMethod.getDeclaringClass().getName();
    }

    public TransformCall(Transformer next, String oldMethodName,
                         CtMethod substMethod)
    {
        super(next);
        methodname = oldMethodName;
        methodDescriptor = substMethod.getMethodInfo2().getDescriptor();
        classname = newClassname = substMethod.getDeclaringClass().getName(); 
        newMethodname = substMethod.getName();
        constPool = null;
        newMethodIsPrivate = Modifier.isPrivate(substMethod.getModifiers());
    }

    public void initialize(ConstPool cp, CodeAttribute attr) {
        if (constPool != cp)
            newIndex = 0;
    }

    /**
     * Modify INVOKEINTERFACE, INVOKESPECIAL, INVOKESTATIC and INVOKEVIRTUAL
     * so that a different method is invoked.
     */
    public int transform(CtClass clazz, int pos, CodeIterator iterator,
                         ConstPool cp) throws BadBytecode
    {
        int c = iterator.byteAt(pos);
        if (c == INVOKEINTERFACE || c == INVOKESPECIAL
                        || c == INVOKESTATIC || c == INVOKEVIRTUAL) {
            int index = iterator.u16bitAt(pos + 1);
            int typedesc = cp.isMember(classname, methodname, index);
            if (typedesc != 0)
                if (cp.getUtf8Info(typedesc).equals(methodDescriptor))
                    pos = match(c, pos, iterator, typedesc, cp);
        }

        return pos;
    }

    protected int match(int c, int pos, CodeIterator iterator,
                        int typedesc, ConstPool cp) throws BadBytecode
    {
        if (newIndex == 0) {
            int nt = cp.addNameAndTypeInfo(cp.addUtf8Info(newMethodname),
                                           typedesc);
            int ci = cp.addClassInfo(newClassname);
            if (c == INVOKEINTERFACE)
                newIndex = cp.addInterfaceMethodrefInfo(ci, nt);
            else {
                if (newMethodIsPrivate && c == INVOKEVIRTUAL)
                    iterator.writeByte(INVOKESPECIAL, pos);

                newIndex = cp.addMethodrefInfo(ci, nt);
            }

            constPool = cp;
        }

        iterator.write16bit(newIndex, pos + 1);
        return pos;
    }
}
