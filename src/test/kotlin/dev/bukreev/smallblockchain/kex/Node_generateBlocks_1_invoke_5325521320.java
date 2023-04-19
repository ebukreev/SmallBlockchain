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

public class Node_generateBlocks_1_invoke_5325521320 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term67;

    public Node_generateBlocks_1_invoke_5325521320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$generateBlocks$1"));
        Object term68 = newInstance(Class.forName("java.lang.Object"));
        Object term69 = newInstance(Class.forName("java.lang.Object"));
        Object term71 = newInstance(Class.forName("java.lang.Object"));
        setField(term67, term67.getClass(), "L$1", term68);
        setField(term67, term67.getClass(), "L$2", term69);
        setIntField(term67, term67.getClass(), "label", 1876565163);
        setField(term67, term67.getClass(), "L$0", term71);
        setField(term67, term67.getClass(), "this$0", null);
        setIntField(term67, term67.getClass(), "arity", -817164822);
        setField(term67, term67.getClass(), "_context", null);
        setField(term67, term67.getClass(), "intercepted", null);
        setField(term67, term67.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$generateBlocks$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "invoke", argTypes, term67, args);
    }

};


