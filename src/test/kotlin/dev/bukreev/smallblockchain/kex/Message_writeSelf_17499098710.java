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

public class Message_writeSelf_17499098710 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term352;

    public Message_writeSelf_17499098710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352 = newInstance(Class.forName("dev.bukreev.smallblockchain.Message"));
        setField(term352, term352.getClass(), "messageType", null);
        setField(term352, term352.getClass(), "senderId", null);
        setField(term352, term352.getClass(), "block", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Message");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("dev.bukreev.smallblockchain.Message");
        argTypes[1] = Class.forName("kotlinx.serialization.encoding.CompositeEncoder");
        argTypes[2] = Class.forName("kotlinx.serialization.descriptors.SerialDescriptor");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "write$Self", argTypes, term352, args);
    }

};


