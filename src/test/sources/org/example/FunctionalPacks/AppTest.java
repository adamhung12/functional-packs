package org.example.FunctionalPacks;

import me.xethh.utils.functionalPacks.JStream;
import me.xethh.utils.functionalPacks.Scope;
import me.xethh.utils.functionalPacks.tuples.Tuple2;
import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testScope() {
        assertEquals(new X(100), Scope.of(new X()).apply(it -> it.value = 100).unscoped());
        assertEquals(new X(2), Scope.of(1).let(it -> new X(2)).unscoped());
    }

    @Test
    public void testJStream() {
        Stream<Tuple2<Integer, String>> stream;
        stream = JStream.zipWithIndex(Arrays.asList("+", "-", "*", "/"));
        assertArrayEquals(Arrays.asList(0, 1, 2, 3).toArray(Integer[]::new), stream.map(it -> it.v1).toArray(Integer[]::new));
        stream = JStream.zipWithIndex(Arrays.asList("+", "-", "*", "/"));
        assertArrayEquals(Arrays.asList("+", "-", "*", "/").toArray(String[]::new), stream.map(it -> it.v2).toArray(String[]::new));

        stream = JStream.zipWithIndex(Arrays.asList("+", "-", "*", "/"), 10);
        assertArrayEquals(Arrays.asList(10, 11, 12, 13).toArray(Integer[]::new), stream.map(it -> it.v1).toArray(Integer[]::new));
        stream = JStream.zipWithIndex(Arrays.asList("+", "-", "*", "/"));
        assertArrayEquals(Arrays.asList("+", "-", "*", "/").toArray(String[]::new), stream.map(it -> it.v2).toArray(String[]::new));

    }

    public static class X {
        public int value = 0;

        public X(int x) {
            this.value = x;
        }

        public X() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            X x = (X) o;
            return value == x.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
}
