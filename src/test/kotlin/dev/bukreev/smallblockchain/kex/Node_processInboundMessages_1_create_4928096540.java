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

public class Node_processInboundMessages_1_create_4928096540 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term471;
     Object term478;

    public Node_processInboundMessages_1_create_4928096540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$processInboundMessages$1"));
        Object term472 = newInstance(Class.forName("java.lang.Object"));
        Object term473 = newInstance(Class.forName("java.lang.Object"));
        Object term476 = newInstance(Class.forName("java.lang.Object"));
        setField(term471, term471.getClass(), "L$1", term472);
        setField(term471, term471.getClass(), "L$2", term473);
        setBooleanField(term471, term471.getClass(), "Z$0", true);
        setIntField(term471, term471.getClass(), "label", 344323424);
        setField(term471, term471.getClass(), "L$0", term476);
        setField(term471, term471.getClass(), "this$0", null);
        setIntField(term471, term471.getClass(), "arity", 9726679);
        setField(term471, term471.getClass(), "_context", null);
        setField(term471, term471.getClass(), "intercepted", null);
        setField(term471, term471.getClass(), "completion", null);
        term478 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$processInboundMessages$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = term478;
        args[1] = null;
        callMethod(klass, "create", argTypes, term471, args);
    }

};


