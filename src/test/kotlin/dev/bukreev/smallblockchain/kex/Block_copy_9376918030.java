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

public class Block_copy_9376918030 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term179;
     Object term182;
     Object term184;

    public Block_copy_9376918030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = newInstance(Class.forName("dev.bukreev.smallblockchain.Block"));
        setIntField(term179, term179.getClass(), "index", 0);
        setField(term179, term179.getClass(), "previousHash", null);
        setIntField(term179, term179.getClass(), "nonce", 0);
        setField(term179, term179.getClass(), "data", null);
        setField(term179, term179.getClass(), "hash", null);
        term182 = newInstance(Class.forName("java.lang.Integer"));
        setIntField(term182, term182.getClass(), "value", 0);
        term184 = newInstance(Class.forName("java.lang.Integer"));
        setIntField(term184, term184.getClass(), "value", 0);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Block");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term182;
        args[1] = null;
        args[2] = term184;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "copy", argTypes, term179, args);
    }

};


