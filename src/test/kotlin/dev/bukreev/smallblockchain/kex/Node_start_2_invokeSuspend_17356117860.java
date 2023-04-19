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

public class Node_start_2_invokeSuspend_17356117860 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term365;
     Object term370;

    public Node_start_2_invokeSuspend_17356117860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$start$2"));
        Object term367 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term365, term365.getClass(), "label", 1107176718);
        setField(term365, term365.getClass(), "L$0", term367);
        setBooleanField(term365, term365.getClass(), "$startGeneration", true);
        setField(term365, term365.getClass(), "this$0", null);
        setIntField(term365, term365.getClass(), "arity", 480137250);
        setField(term365, term365.getClass(), "_context", null);
        setField(term365, term365.getClass(), "intercepted", null);
        setField(term365, term365.getClass(), "completion", null);
        term370 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$start$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term370;
        callMethod(klass, "invokeSuspend", argTypes, term365, args);
    }

};


