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

public class Node_processBlock_1_invokeSuspend_8163462331 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term433;

    public Node_processBlock_1_invokeSuspend_8163462331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$processBlock$1"));
        setField(term433, term433.getClass(), "L$0", null);
        setField(term433, term433.getClass(), "L$1", null);
        setField(term433, term433.getClass(), "L$2", null);
        setField(term433, term433.getClass(), "result", null);
        setField(term433, term433.getClass(), "this$0", null);
        setIntField(term433, term433.getClass(), "label", 0);
        setField(term433, term433.getClass(), "_context", null);
        setField(term433, term433.getClass(), "intercepted", null);
        setField(term433, term433.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$processBlock$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "invokeSuspend", argTypes, term433, args);
    }

};


