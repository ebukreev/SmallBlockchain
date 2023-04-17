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

public class Node_generateBlocks_1_invoke_5325521321 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term90;

    public Node_generateBlocks_1_invoke_5325521321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$generateBlocks$1"));
        setField(term90, term90.getClass(), "L$1", null);
        setField(term90, term90.getClass(), "L$2", null);
        setIntField(term90, term90.getClass(), "label", 0);
        setField(term90, term90.getClass(), "L$0", null);
        setField(term90, term90.getClass(), "this$0", null);
        setIntField(term90, term90.getClass(), "arity", 0);
        setField(term90, term90.getClass(), "_context", null);
        setField(term90, term90.getClass(), "intercepted", null);
        setField(term90, term90.getClass(), "completion", null);
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
        callMethod(klass, "invoke", argTypes, term90, args);
    }

};


