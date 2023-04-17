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

public class Node_generateBlocks_1574771180 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term245;

    public Node_generateBlocks_1574771180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node"));
        setField(term245, term245.getClass(), "inboundAddress", null);
        setField(term245, term245.getClass(), "nodeId", null);
        setField(term245, term245.getClass(), "otherNodes", null);
        setField(term245, term245.getClass(), "currentBlock", null);
        setField(term245, term245.getClass(), "blocks", null);
        setField(term245, term245.getClass(), "mutex", null);
        setField(term245, term245.getClass(), "logger", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "generateBlocks", argTypes, term245, args);
    }

};


