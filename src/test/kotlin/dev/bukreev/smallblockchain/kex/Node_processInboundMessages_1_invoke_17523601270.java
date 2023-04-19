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

public class Node_processInboundMessages_1_invoke_17523601270 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term481;

    public Node_processInboundMessages_1_invoke_17523601270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$processInboundMessages$1"));
        Object term482 = newInstance(Class.forName("java.lang.Object"));
        Object term483 = newInstance(Class.forName("java.lang.Object"));
        Object term486 = newInstance(Class.forName("java.lang.Object"));
        setField(term481, term481.getClass(), "L$1", term482);
        setField(term481, term481.getClass(), "L$2", term483);
        setBooleanField(term481, term481.getClass(), "Z$0", true);
        setIntField(term481, term481.getClass(), "label", -25637976);
        setField(term481, term481.getClass(), "L$0", term486);
        setField(term481, term481.getClass(), "this$0", null);
        setIntField(term481, term481.getClass(), "arity", 1555897383);
        setField(term481, term481.getClass(), "_context", null);
        setField(term481, term481.getClass(), "intercepted", null);
        setField(term481, term481.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$processInboundMessages$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "invoke", argTypes, term481, args);
    }

};


