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

public class StandartNonceChangersKt_fibonacci_1_invoke_19622786811 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term292;
     Object term294;

    public StandartNonceChangersKt_fibonacci_1_invoke_19622786811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292 = newInstance(Class.forName("dev.bukreev.smallblockchain.StandartNonceChangersKt$fibonacci$1"));
        setIntField(term292, term292.getClass(), "arity", 0);
        term294 = newInstance(Class.forName("java.lang.Integer"));
        setIntField(term294, term294.getClass(), "value", 0);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.StandartNonceChangersKt$fibonacci$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term294;
        callMethod(klass, "invoke", argTypes, term292, args);
    }

};


