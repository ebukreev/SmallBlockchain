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

public class Node_start_2_invoke_13469170980 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term359;

    public Node_start_2_invoke_13469170980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$start$2"));
        Object term361 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term359, term359.getClass(), "label", 1474524152);
        setField(term359, term359.getClass(), "L$0", term361);
        setBooleanField(term359, term359.getClass(), "$startGeneration", true);
        setField(term359, term359.getClass(), "this$0", null);
        setIntField(term359, term359.getClass(), "arity", 568954359);
        setField(term359, term359.getClass(), "_context", null);
        setField(term359, term359.getClass(), "intercepted", null);
        setField(term359, term359.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$start$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "invoke", argTypes, term359, args);
    }

};


