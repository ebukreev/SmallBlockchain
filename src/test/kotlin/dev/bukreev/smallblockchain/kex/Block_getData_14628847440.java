package dev.bukreev.smallblockchain.kex;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;

import static dev.bukreev.smallblockchain.ReflectionUtils.*;

public class Block_getData_14628847440 {
    @Rule public Timeout globalTimeout = new Timeout(100, TimeUnit.SECONDS);
     Object term139;

    public Block_getData_14628847440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("dev.bukreev.smallblockchain.Block"));
        setIntField(term139, term139.getClass(), "index", 0);
        setField(term139, term139.getClass(), "previousHash", null);
        setIntField(term139, term139.getClass(), "nonce", 0);
        setField(term139, term139.getClass(), "data", null);
        setField(term139, term139.getClass(), "hash", null);
    }

    @Test
    public void test() throws Throwable {
        Class<?> klass = Class.forName("dev.bukreev.smallblockchain.Block");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term139, args);
    }

};


