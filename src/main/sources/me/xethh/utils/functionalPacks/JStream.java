package me.xethh.utils.functionalPacks;

import me.xethh.utils.functionalPacks.tuples.Tuple2;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * JStream provide functionality to zip iterable or iterator as indexed stream
 */
public class JStream {

    /**
     * zip iterator as indexed stream
     * @param iterator iterator of generic T value
     * @param <T> any java class
     * @return stream with {@link Tuple2} of index and item
     */
    public static <T> Stream<Tuple2<Integer, T>> zipWithIndex(Iterator<T> iterator) {
        return zipWithIndex(iterator, 0);
    }

    /**
     * zip iterator as indexed stream
     * @param iterator iterator of generic T value
     * @param initIndex the starting index
     * @param <T> any java class
     * @return stream with {@link Tuple2} of index and item
     */
    public static <T> Stream<Tuple2<Integer, T>> zipWithIndex(Iterator<T> iterator, int initIndex) {
        Iterator<Tuple2<Integer, T>> it = new Iterator<Tuple2<Integer, T>>() {
            int i = initIndex;

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Tuple2<Integer, T> next() {
                return Tuple2.of(i++, iterator.next());
            }
        };

        Spliterator<Tuple2<Integer, T>> spliterator = Spliterators.spliteratorUnknownSize(it, 0);

        return StreamSupport.stream(spliterator, false);
    }

    /**
     * zip iterable as indexed stream
     * @param iterable iterable of generic T value
     * @param <T> any java class
     * @return stream with {@link Tuple2} of index and item
     */
    public static <T> Stream<Tuple2<Integer, T>> zipWithIndex(Iterable<T> iterable) {
        return zipWithIndex(iterable.iterator());
    }

    /**
     * zip iterable as indexed stream
     * @param iterable iterable of generic T value
     * @param initIndex starting index
     * @param <T> any java class
     * @return stream with {@link Tuple2} of index and item
     */
    public static <T> Stream<Tuple2<Integer, T>> zipWithIndex(Iterable<T> iterable, int initIndex) {
        return zipWithIndex(iterable.iterator(), initIndex);
    }

}
