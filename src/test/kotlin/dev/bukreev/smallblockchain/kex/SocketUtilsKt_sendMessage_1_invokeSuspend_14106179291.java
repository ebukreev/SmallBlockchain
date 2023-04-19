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

public class SocketUtilsKt_sendMessage_1_invokeSuspend_14106179291 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term310;

    public SocketUtilsKt_sendMessage_1_invokeSuspend_14106179291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310 = newInstance(Class.forName("dev.bukreev.smallblockchain.SocketUtilsKt$sendMessage$1"));
        setField(term310, term310.getClass(), "L$0", null);
        setField(term310, term310.getClass(), "L$1", null);
        setField(term310, term310.getClass(), "result", null);
        setIntField(term310, term310.getClass(), "label", 0);
        setField(term310, term310.getClass(), "_context", null);
        setField(term310, term310.getClass(), "intercepted", null);
        setField(term310, term310.getClass(), "completion", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.SocketUtilsKt$sendMessage$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "invokeSuspend", argTypes, term310, args);
    }

};


