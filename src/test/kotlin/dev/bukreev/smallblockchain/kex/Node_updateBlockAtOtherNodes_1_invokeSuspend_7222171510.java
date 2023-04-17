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

public class Node_updateBlockAtOtherNodes_1_invokeSuspend_7222171510 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term279;
     Object term285;

    public Node_updateBlockAtOtherNodes_1_invokeSuspend_7222171510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$updateBlockAtOtherNodes$1"));
        Object term280 = newInstance(Class.forName("java.lang.Object"));
        Object term281 = newInstance(Class.forName("java.lang.Object"));
        Object term282 = newInstance(Class.forName("java.lang.Object"));
        Object term283 = newInstance(Class.forName("java.lang.Object"));
        setField(term279, term279.getClass(), "L$0", term280);
        setField(term279, term279.getClass(), "L$1", term281);
        setField(term279, term279.getClass(), "L$2", term282);
        setField(term279, term279.getClass(), "result", term283);
        setField(term279, term279.getClass(), "this$0", null);
        setIntField(term279, term279.getClass(), "label", -1845499264);
        setField(term279, term279.getClass(), "_context", null);
        setField(term279, term279.getClass(), "intercepted", null);
        setField(term279, term279.getClass(), "completion", null);
        term285 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$updateBlockAtOtherNodes$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term285;
        callMethod(klass, "invokeSuspend", argTypes, term279, args);
    }

};


