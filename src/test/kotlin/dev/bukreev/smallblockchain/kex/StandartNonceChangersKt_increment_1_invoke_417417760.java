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

public class StandartNonceChangersKt_increment_1_invoke_417417760 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term500;
     Object term502;

    public StandartNonceChangersKt_increment_1_invoke_417417760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500 = newInstance(Class.forName("dev.bukreev.smallblockchain.StandartNonceChangersKt$increment$1"));
        setIntField(term500, term500.getClass(), "arity", 1);
        term502 = newInstance(Class.forName("java.lang.Integer"));
        setIntField(term502, term502.getClass(), "value", 202001407);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.StandartNonceChangersKt$increment$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term502;
        callMethod(klass, "invoke", argTypes, term500, args);
    }

};


