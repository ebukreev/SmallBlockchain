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
import java.lang.Object;

public class SocketUtilsKt_receiveMessage_1_invokeSuspend_2973426340 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term416;
     Object term420;

    public SocketUtilsKt_receiveMessage_1_invokeSuspend_2973426340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416 = newInstance(Class.forName("dev.bukreev.smallblockchain.SocketUtilsKt$receiveMessage$1"));
        Object term417 = newInstance(Class.forName("java.lang.Object"));
        Object term418 = newInstance(Class.forName("java.lang.Object"));
        setField(term416, term416.getClass(), "L$0", term417);
        setField(term416, term416.getClass(), "result", term418);
        setIntField(term416, term416.getClass(), "label", -343325701);
        setField(term416, term416.getClass(), "_context", null);
        setField(term416, term416.getClass(), "intercepted", null);
        setField(term416, term416.getClass(), "completion", null);
        term420 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.SocketUtilsKt$receiveMessage$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term420;
        callMethod(klass, "invokeSuspend", argTypes, term416, args);
    }

};


