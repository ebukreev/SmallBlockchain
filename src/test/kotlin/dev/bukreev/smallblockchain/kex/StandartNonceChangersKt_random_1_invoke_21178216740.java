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

public class StandartNonceChangersKt_random_1_invoke_21178216740 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term296;
     Object term298;

    public StandartNonceChangersKt_random_1_invoke_21178216740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296 = newInstance(Class.forName("dev.bukreev.smallblockchain.StandartNonceChangersKt$random$1"));
        setIntField(term296, term296.getClass(), "arity", 1);
        term298 = newInstance(Class.forName("java.lang.Integer"));
        setIntField(term298, term298.getClass(), "value", -344842608);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.StandartNonceChangersKt$random$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term298;
        callMethod(klass, "invoke", argTypes, term296, args);
    }

};


