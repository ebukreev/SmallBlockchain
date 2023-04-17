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

public class Node_start_2_invoke_13469170981 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term385;

    public Node_start_2_invoke_13469170981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385 = newInstance(Class.forName("dev.bukreev.smallblockchain.Node$start$2"));
        setIntField(term385, term385.getClass(), "label", 0);
        setField(term385, term385.getClass(), "L$0", null);
        setBooleanField(term385, term385.getClass(), "$startGeneration", false);
        setField(term385, term385.getClass(), "this$0", null);
        setIntField(term385, term385.getClass(), "arity", 0);
        setField(term385, term385.getClass(), "_context", null);
        setField(term385, term385.getClass(), "intercepted", null);
        setField(term385, term385.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node$start$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("kotlinx.coroutines.CoroutineScope");
        argTypes[1] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "invoke", argTypes, term385, args);
    }

};


