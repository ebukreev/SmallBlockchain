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

public class Block_writeSelf_485673250 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term209;

    public Block_writeSelf_485673250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("dev.bukreev.smallblockchain.Block"));
        setIntField(term209, term209.getClass(), "index", 0);
        setField(term209, term209.getClass(), "previousHash", null);
        setIntField(term209, term209.getClass(), "nonce", 0);
        setField(term209, term209.getClass(), "data", null);
        setField(term209, term209.getClass(), "hash", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Block");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("dev.bukreev.smallblockchain.Block");
        argTypes[1] = Class.forName("kotlinx.serialization.encoding.CompositeEncoder");
        argTypes[2] = Class.forName("kotlinx.serialization.descriptors.SerialDescriptor");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "write$Self", argTypes, term209, args);
    }

};


