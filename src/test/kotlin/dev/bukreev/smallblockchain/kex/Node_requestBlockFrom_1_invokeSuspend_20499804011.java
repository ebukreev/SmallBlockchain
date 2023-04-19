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

public class Node_requestBlockFrom_1_invokeSuspend_20499804011 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term274;

    public Node_requestBlockFrom_1_invokeSuspend_20499804011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$requestBlockFrom$1"));
        setField(term274, term274.getClass(), "L$0", null);
        setField(term274, term274.getClass(), "result", null);
        setField(term274, term274.getClass(), "this$0", null);
        setIntField(term274, term274.getClass(), "label", 0);
        setField(term274, term274.getClass(), "_context", null);
        setField(term274, term274.getClass(), "intercepted", null);
        setField(term274, term274.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$requestBlockFrom$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "invokeSuspend", argTypes, term274, args);
    }

};


