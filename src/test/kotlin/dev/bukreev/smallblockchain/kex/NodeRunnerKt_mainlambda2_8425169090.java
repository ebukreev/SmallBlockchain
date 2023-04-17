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

public class NodeRunnerKt_mainlambda2_8425169090 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term66;

    public NodeRunnerKt_mainlambda2_8425169090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("dev.bukreev.smallblockchain.NodeRunnerKt"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.NodeRunnerKt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlinx.cli.ArgumentValueDelegate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "main$lambda$2", argTypes, term66, args);
    }

};


