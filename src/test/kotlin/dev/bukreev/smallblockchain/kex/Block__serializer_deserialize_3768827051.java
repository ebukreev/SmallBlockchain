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

public class Block__serializer_deserialize_3768827051 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term399;

    public Block__serializer_deserialize_3768827051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399 = newInstance(Class.forName("dev.bukreev.smallblockchain.Block$$serializer"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Block$$serializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlinx.serialization.encoding.Decoder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "deserialize", argTypes, term399, args);
    }

};


