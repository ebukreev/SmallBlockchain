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

public class Node_getBlocksSmallBlockchain_1645457410 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term221;

    public Node_getBlocksSmallBlockchain_1645457410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node"));
        setField(term221, term221.getClass(), "inboundAddress", null);
        setField(term221, term221.getClass(), "nodeId", null);
        setField(term221, term221.getClass(), "otherNodes", null);
        setField(term221, term221.getClass(), "currentBlock", null);
        setField(term221, term221.getClass(), "blocks", null);
        setField(term221, term221.getClass(), "mutex", null);
        setField(term221, term221.getClass(), "logger", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlocks$SmallBlockchain", argTypes, term221, args);
    }

};


