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

public class Message_init_20679025540 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);

    public Message_init_20679025540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Message");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("dev.bukreev.smallblockchain.MessageType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("dev.bukreev.smallblockchain.Block");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callConstructor(klass, argTypes, args);
    }

};


