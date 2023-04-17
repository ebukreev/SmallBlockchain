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

public class Node_init_2635978370 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term230;

    public Node_init_2635978370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230 = newInstance(Class.forName("io.ktor.network.sockets.InetSocketAddress"));
        setField(term230, term230.getClass(), "address", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.ktor.network.sockets.SocketAddress");
        Object[] args = new Object[1];
        args[0] = term230;
        callConstructor(klass, argTypes, args);
    }

};


