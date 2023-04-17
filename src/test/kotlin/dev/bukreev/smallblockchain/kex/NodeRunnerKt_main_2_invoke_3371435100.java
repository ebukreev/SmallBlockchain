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

public class NodeRunnerKt_main_2_invoke_3371435100 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term459;

    public NodeRunnerKt_main_2_invoke_3371435100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459 = newInstance(Class.forName("dev.bukreev.smallblockchain.NodeRunnerKt$main$2"));
        setIntField(term459, term459.getClass(), "label", 0);
        setField(term459, term459.getClass(), "$node", null);
        setField(term459, term459.getClass(), "$first$delegate", null);
        setIntField(term459, term459.getClass(), "arity", 0);
        setField(term459, term459.getClass(), "_context", null);
        setField(term459, term459.getClass(), "intercepted", null);
        setField(term459, term459.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.NodeRunnerKt$main$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "invoke", argTypes, term459, args);
    }

};


