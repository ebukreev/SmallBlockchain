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

public class Node_start_2_invokeSuspend_17356117861 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term377;

    public Node_start_2_invokeSuspend_17356117861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$start$2"));
        setIntField(term377, term377.getClass(), "label", 0);
        setField(term377, term377.getClass(), "L$0", null);
        setBooleanField(term377, term377.getClass(), "$startGeneration", false);
        setField(term377, term377.getClass(), "this$0", null);
        setIntField(term377, term377.getClass(), "arity", 0);
        setField(term377, term377.getClass(), "_context", null);
        setField(term377, term377.getClass(), "intercepted", null);
        setField(term377, term377.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$start$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "invokeSuspend", argTypes, term377, args);
    }

};


