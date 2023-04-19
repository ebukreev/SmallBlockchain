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

public class Node_generateBlocks_1_invokeSuspend_9212468200 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term73;
     Object term79;

    public Node_generateBlocks_1_invokeSuspend_9212468200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$generateBlocks$1"));
        Object term74 = newInstance(Class.forName("java.lang.Object"));
        Object term75 = newInstance(Class.forName("java.lang.Object"));
        Object term77 = newInstance(Class.forName("java.lang.Object"));
        setField(term73, term73.getClass(), "L$1", term74);
        setField(term73, term73.getClass(), "L$2", term75);
        setIntField(term73, term73.getClass(), "label", -1016503459);
        setField(term73, term73.getClass(), "L$0", term77);
        setField(term73, term73.getClass(), "this$0", null);
        setIntField(term73, term73.getClass(), "arity", -1968847291);
        setField(term73, term73.getClass(), "_context", null);
        setField(term73, term73.getClass(), "intercepted", null);
        setField(term73, term73.getClass(), "completion", null);
        term79 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$generateBlocks$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term79;
        callMethod(klass, "invokeSuspend", argTypes, term73, args);
    }

};


