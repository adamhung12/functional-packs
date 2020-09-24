package me.xethh.utils.functionalPacks.tuples;

public class Tuple4<V1, V2, V3, V4> {
    public final V1 v1;
    public final V2 v2;
    public final V3 v3;
    public final V4 v4;

    private Tuple4(V1 v1, V2 v2, V3 v3, V4 v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    public static <V1, V2, V3, V4> Tuple4<V1, V2, V3, V4> of(V1 v1, V2 v2, V3 v3, V4 v4) {
        return new Tuple4<>(v1, v2, v3, v4);
    }
}
