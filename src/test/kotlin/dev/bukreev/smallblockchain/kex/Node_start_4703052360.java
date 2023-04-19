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

public class Node_start_4703052360 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term235;
     Object term236;

    public Node_start_4703052360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node"));
        setField(term235, term235.getClass(), "inboundAddress", null);
        setField(term235, term235.getClass(), "nodeId", null);
        setField(term235, term235.getClass(), "otherNodes", null);
        setField(term235, term235.getClass(), "currentBlock", null);
        setField(term235, term235.getClass(), "blocks", null);
        setField(term235, term235.getClass(), "mutex", null);
        setField(term235, term235.getClass(), "logger", null);
        term236 = newInstance(Class.forName("java.lang.Boolean"));
        setBooleanField(term236, term236.getClass(), "value", false);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = term236;
        args[1] = null;
        callMethod(klass, "start", argTypes, term235, args);
    }

};


