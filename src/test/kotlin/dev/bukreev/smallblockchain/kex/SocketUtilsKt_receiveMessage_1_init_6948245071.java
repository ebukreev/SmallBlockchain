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

public class SocketUtilsKt_receiveMessage_1_init_6948245071 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);

    public SocketUtilsKt_receiveMessage_1_init_6948245071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.SocketUtilsKt$receiveMessage$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.coroutines.Continuation");
        Object[] args = new Object[1];
        args[0] = null;
        callConstructor(klass, argTypes, args);
    }

};


