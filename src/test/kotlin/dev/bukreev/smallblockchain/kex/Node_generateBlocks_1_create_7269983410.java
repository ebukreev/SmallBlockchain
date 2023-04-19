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

public class Node_generateBlocks_1_create_7269983410 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term83;
     Object term89;

    public Node_generateBlocks_1_create_7269983410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$generateBlocks$1"));
        Object term84 = newInstance(Class.forName("java.lang.Object"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term87 = newInstance(Class.forName("java.lang.Object"));
        setField(term83, term83.getClass(), "L$1", term84);
        setField(term83, term83.getClass(), "L$2", term85);
        setIntField(term83, term83.getClass(), "label", 579005622);
        setField(term83, term83.getClass(), "L$0", term87);
        setField(term83, term83.getClass(), "this$0", null);
        setIntField(term83, term83.getClass(), "arity", -14890619);
        setField(term83, term83.getClass(), "_context", null);
        setField(term83, term83.getClass(), "intercepted", null);
        setField(term83, term83.getClass(), "completion", null);
        term89 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$generateBlocks$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = term89;
        args[1] = null;
        callMethod(klass, "create", argTypes, term83, args);
    }

};


