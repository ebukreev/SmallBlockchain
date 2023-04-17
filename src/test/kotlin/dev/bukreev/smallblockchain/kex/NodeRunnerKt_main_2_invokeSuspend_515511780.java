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

public class NodeRunnerKt_main_2_invokeSuspend_515511780 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term440;

    public NodeRunnerKt_main_2_invokeSuspend_515511780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term440 = newInstance(Class.forName("dev.bukreev.smallblockchain.NodeRunnerKt$main$2"));
        setIntField(term440, term440.getClass(), "label", 0);
        setField(term440, term440.getClass(), "$node", null);
        setField(term440, term440.getClass(), "$first$delegate", null);
        setIntField(term440, term440.getClass(), "arity", 0);
        setField(term440, term440.getClass(), "_context", null);
        setField(term440, term440.getClass(), "intercepted", null);
        setField(term440, term440.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.NodeRunnerKt$main$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "invokeSuspend", argTypes, term440, args);
    }

};


