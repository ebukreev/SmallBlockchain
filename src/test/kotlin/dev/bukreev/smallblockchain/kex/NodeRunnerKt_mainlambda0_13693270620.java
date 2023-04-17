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

public class NodeRunnerKt_mainlambda0_13693270620 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term64;

    public NodeRunnerKt_mainlambda0_13693270620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("dev.bukreev.smallblockchain.NodeRunnerKt"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.NodeRunnerKt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlinx.cli.ArgumentValueDelegate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "main$lambda$0", argTypes, term64, args);
    }

};


