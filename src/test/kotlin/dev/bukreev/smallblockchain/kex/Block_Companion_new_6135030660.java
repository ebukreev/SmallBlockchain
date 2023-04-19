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

public class Block_Companion_new_6135030660 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term317;

    public Block_Companion_new_6135030660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317 = newInstance(Class.forName("dev.bukreev.smallblockchain.Block$Companion"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Block$Companion");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("dev.bukreev.smallblockchain.Block");
        argTypes[1] = Class.forName("kotlin.jvm.functions.Function1");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "new", argTypes, term317, args);
    }

};


