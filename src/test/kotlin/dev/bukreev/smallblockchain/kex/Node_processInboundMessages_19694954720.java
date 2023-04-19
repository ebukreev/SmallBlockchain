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

public class Node_processInboundMessages_19694954720 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term241;

    public Node_processInboundMessages_19694954720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node"));
        setField(term241, term241.getClass(), "inboundAddress", null);
        setField(term241, term241.getClass(), "nodeId", null);
        setField(term241, term241.getClass(), "otherNodes", null);
        setField(term241, term241.getClass(), "currentBlock", null);
        setField(term241, term241.getClass(), "blocks", null);
        setField(term241, term241.getClass(), "mutex", null);
        setField(term241, term241.getClass(), "logger", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "processInboundMessages", argTypes, term241, args);
    }

};


