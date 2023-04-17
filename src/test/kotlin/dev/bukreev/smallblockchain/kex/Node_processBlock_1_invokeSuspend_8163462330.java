package dev.bukreev.smallblockchain.kex;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import static dev.bukreev.smallblockchain.ReflectionUtils.*;
import java.lang.Object;

public class Node_processBlock_1_invokeSuspend_8163462330 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term425;
     Object term432;

    public Node_processBlock_1_invokeSuspend_8163462330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$processBlock$1"));
        Object term427 = newInstance(Class.forName("java.lang.Object"));
        Object term428 = newInstance(Class.forName("java.lang.Object"));
        Object term429 = newInstance(Class.forName("java.lang.Object"));
        Object term430 = newInstance(Class.forName("java.lang.Object"));
        setField(term425, term425.getClass(), "L$0", term427);
        setField(term425, term425.getClass(), "L$1", term428);
        setField(term425, term425.getClass(), "L$2", term429);
        setField(term425, term425.getClass(), "result", term430);
        setField(term425, term425.getClass(), "this$0", null);
        setIntField(term425, term425.getClass(), "label", 107945604);
        setField(term425, term425.getClass(), "_context", null);
        setField(term425, term425.getClass(), "intercepted", null);
        setField(term425, term425.getClass(), "completion", null);
        term432 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$processBlock$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term432;
        callMethod(klass, "invokeSuspend", argTypes, term425, args);
    }

};


