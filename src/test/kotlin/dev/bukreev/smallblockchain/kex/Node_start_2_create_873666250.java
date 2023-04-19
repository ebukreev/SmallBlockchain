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

public class Node_start_2_create_873666250 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term371;
     Object term376;

    public Node_start_2_create_873666250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$start$2"));
        Object term373 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term371, term371.getClass(), "label", 53410913);
        setField(term371, term371.getClass(), "L$0", term373);
        setBooleanField(term371, term371.getClass(), "$startGeneration", true);
        setField(term371, term371.getClass(), "this$0", null);
        setIntField(term371, term371.getClass(), "arity", -375014958);
        setField(term371, term371.getClass(), "_context", null);
        setField(term371, term371.getClass(), "intercepted", null);
        setField(term371, term371.getClass(), "completion", null);
        term376 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$start$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = term376;
        args[1] = null;
        callMethod(klass, "create", argTypes, term371, args);
    }

};


