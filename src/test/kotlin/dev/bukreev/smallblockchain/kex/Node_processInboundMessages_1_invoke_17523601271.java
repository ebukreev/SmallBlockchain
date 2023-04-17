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

public class Node_processInboundMessages_1_invoke_17523601271 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term492;

    public Node_processInboundMessages_1_invoke_17523601271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$processInboundMessages$1"));
        setField(term492, term492.getClass(), "L$1", null);
        setField(term492, term492.getClass(), "L$2", null);
        setBooleanField(term492, term492.getClass(), "Z$0", false);
        setIntField(term492, term492.getClass(), "label", 0);
        setField(term492, term492.getClass(), "L$0", null);
        setField(term492, term492.getClass(), "this$0", null);
        setIntField(term492, term492.getClass(), "arity", 0);
        setField(term492, term492.getClass(), "_context", null);
        setField(term492, term492.getClass(), "intercepted", null);
        setField(term492, term492.getClass(), "completion", null);
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
        callMethod(klass, "invoke", argTypes, term492, args);
    }

};


