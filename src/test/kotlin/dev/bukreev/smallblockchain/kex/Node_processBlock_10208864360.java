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

public class Node_processBlock_10208864360 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term249;
     Object term250;
     Object term252;

    public Node_processBlock_10208864360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node"));
        setField(term249, term249.getClass(), "inboundAddress", null);
        setField(term249, term249.getClass(), "nodeId", null);
        setField(term249, term249.getClass(), "otherNodes", null);
        setField(term249, term249.getClass(), "currentBlock", null);
        setField(term249, term249.getClass(), "blocks", null);
        setField(term249, term249.getClass(), "mutex", null);
        setField(term249, term249.getClass(), "logger", null);
        term250 = newInstance(Class.forName("java.lang.Boolean"));
        setBooleanField(term250, term250.getClass(), "value", false);
        term252 = newInstance(Class.forName("java.lang.Boolean"));
        setBooleanField(term252, term252.getClass(), "value", false);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("dev.bukreev.smallblockchain.Block");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term250;
        args[2] = term252;
        args[3] = null;
        callMethod(klass, "processBlock", argTypes, term249, args);
    }

};


