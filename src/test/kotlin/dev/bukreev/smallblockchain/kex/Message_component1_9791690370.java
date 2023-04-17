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

public class Message_component1_9791690370 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term340;

    public Message_component1_9791690370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340 = newInstance(Class.forName("dev.bukreev.smallblockchain.Message"));
        setField(term340, term340.getClass(), "messageType", null);
        setField(term340, term340.getClass(), "senderId", null);
        setField(term340, term340.getClass(), "block", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term340, args);
    }

};


