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

public class SocketUtilsKt_sendMessage_1_invokeSuspend_14106179290 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term304;
     Object term309;

    public SocketUtilsKt_sendMessage_1_invokeSuspend_14106179290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304 = newInstance(Class.forName("dev.bukreev.smallblockchain.SocketUtilsKt$sendMessage$1"));
        Object term305 = newInstance(Class.forName("java.lang.Object"));
        Object term306 = newInstance(Class.forName("java.lang.Object"));
        Object term307 = newInstance(Class.forName("java.lang.Object"));
        setField(term304, term304.getClass(), "L$0", term305);
        setField(term304, term304.getClass(), "L$1", term306);
        setField(term304, term304.getClass(), "result", term307);
        setIntField(term304, term304.getClass(), "label", 941650513);
        setField(term304, term304.getClass(), "_context", null);
        setField(term304, term304.getClass(), "intercepted", null);
        setField(term304, term304.getClass(), "completion", null);
        term309 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.SocketUtilsKt$sendMessage$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term309;
        callMethod(klass, "invokeSuspend", argTypes, term304, args);
    }

};


