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

public class StandartNonceChangersKt_getIncrement_11024526661 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term39;

    public StandartNonceChangersKt_getIncrement_11024526661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("dev.bukreev.smallblockchain.StandartNonceChangersKt"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.StandartNonceChangersKt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncrement", argTypes, term39, args);
    }

};


