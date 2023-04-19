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

public class Node_requestBlockFrom_1_invokeSuspend_20499804010 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term266;
     Object term270;

    public Node_requestBlockFrom_1_invokeSuspend_20499804010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$requestBlockFrom$1"));
        Object term267 = newInstance(Class.forName("java.lang.Object"));
        Object term268 = newInstance(Class.forName("java.lang.Object"));
        setField(term266, term266.getClass(), "L$0", term267);
        setField(term266, term266.getClass(), "result", term268);
        setField(term266, term266.getClass(), "this$0", null);
        setIntField(term266, term266.getClass(), "label", -1772434990);
        setField(term266, term266.getClass(), "_context", null);
        setField(term266, term266.getClass(), "intercepted", null);
        setField(term266, term266.getClass(), "completion", null);
        term270 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$requestBlockFrom$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term270;
        callMethod(klass, "invokeSuspend", argTypes, term266, args);
    }

};


