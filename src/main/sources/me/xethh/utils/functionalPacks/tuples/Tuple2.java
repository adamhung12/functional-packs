package me.xethh.utils.functionalPacks.tuples;

public class Tuple2<V1, V2> {
    public final V1 v1;
    public final V2 v2;

    private Tuple2(V1 v1, V2 v2) {
        this.v1 = v1;
        this.v2 = v2;

    }

    public static <V1, V2> Tuple2<V1, V2> of(V1 v1, V2 v2) {
        return new Tuple2<>(v1, v2);
    }
}
