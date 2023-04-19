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

public class Node_getOtherNodesSmallBlockchain_4934822480 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term225;

    public Node_getOtherNodesSmallBlockchain_4934822480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node"));
        setField(term225, term225.getClass(), "inboundAddress", null);
        setField(term225, term225.getClass(), "nodeId", null);
        setField(term225, term225.getClass(), "otherNodes", null);
        setField(term225, term225.getClass(), "currentBlock", null);
        setField(term225, term225.getClass(), "blocks", null);
        setField(term225, term225.getClass(), "mutex", null);
        setField(term225, term225.getClass(), "logger", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOtherNodes$SmallBlockchain", argTypes, term225, args);
    }

};


