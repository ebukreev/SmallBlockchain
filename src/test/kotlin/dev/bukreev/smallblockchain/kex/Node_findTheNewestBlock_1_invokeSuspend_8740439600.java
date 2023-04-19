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

public class Node_findTheNewestBlock_1_invokeSuspend_8740439600 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term99;
     Object term105;

    public Node_findTheNewestBlock_1_invokeSuspend_8740439600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$findTheNewestBlock$1"));
        Object term100 = newInstance(Class.forName("java.lang.Object"));
        Object term101 = newInstance(Class.forName("java.lang.Object"));
        Object term102 = newInstance(Class.forName("java.lang.Object"));
        Object term103 = newInstance(Class.forName("java.lang.Object"));
        setField(term99, term99.getClass(), "L$0", term100);
        setField(term99, term99.getClass(), "L$1", term101);
        setField(term99, term99.getClass(), "L$2", term102);
        setField(term99, term99.getClass(), "result", term103);
        setField(term99, term99.getClass(), "this$0", null);
        setIntField(term99, term99.getClass(), "label", 1632125673);
        setField(term99, term99.getClass(), "_context", null);
        setField(term99, term99.getClass(), "intercepted", null);
        setField(term99, term99.getClass(), "completion", null);
        term105 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$findTheNewestBlock$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "invokeSuspend", argTypes, term99, args);
    }

};


