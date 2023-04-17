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

public class Node_updateBlockAtOtherNodes_1012246300 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term261;

    public Node_updateBlockAtOtherNodes_1012246300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node"));
        setField(term261, term261.getClass(), "inboundAddress", null);
        setField(term261, term261.getClass(), "nodeId", null);
        setField(term261, term261.getClass(), "otherNodes", null);
        setField(term261, term261.getClass(), "currentBlock", null);
        setField(term261, term261.getClass(), "blocks", null);
        setField(term261, term261.getClass(), "mutex", null);
        setField(term261, term261.getClass(), "logger", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("dev.bukreev.smallblockchain.Block");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "updateBlockAtOtherNodes", argTypes, term261, args);
    }

};


