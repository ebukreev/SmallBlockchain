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

public class Node_processInboundMessages_1_invokeSuspend_21410548150 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term465;
     Object term480;

    public Node_processInboundMessages_1_invokeSuspend_21410548150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$processInboundMessages$1"));
        Object term466 = newInstance(Class.forName("java.lang.Object"));
        Object term467 = newInstance(Class.forName("java.lang.Object"));
        Object term470 = newInstance(Class.forName("java.lang.Object"));
        setField(term465, term465.getClass(), "L$1", term466);
        setField(term465, term465.getClass(), "L$2", term467);
        setBooleanField(term465, term465.getClass(), "Z$0", true);
        setIntField(term465, term465.getClass(), "label", 2095798786);
        setField(term465, term465.getClass(), "L$0", term470);
        setField(term465, term465.getClass(), "this$0", null);
        setIntField(term465, term465.getClass(), "arity", -1565502840);
        setField(term465, term465.getClass(), "_context", null);
        setField(term465, term465.getClass(), "intercepted", null);
        setField(term465, term465.getClass(), "completion", null);
        term480 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$processInboundMessages$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term480;
        callMethod(klass, "invokeSuspend", argTypes, term465, args);
    }

};


