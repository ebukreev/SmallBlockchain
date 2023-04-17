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

public class Node_getInboundAddress_19476055400 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term229;

    public Node_getInboundAddress_19476055400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node"));
        setField(term229, term229.getClass(), "inboundAddress", null);
        setField(term229, term229.getClass(), "nodeId", null);
        setField(term229, term229.getClass(), "otherNodes", null);
        setField(term229, term229.getClass(), "currentBlock", null);
        setField(term229, term229.getClass(), "blocks", null);
        setField(term229, term229.getClass(), "mutex", null);
        setField(term229, term229.getClass(), "logger", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInboundAddress", argTypes, term229, args);
    }

};


