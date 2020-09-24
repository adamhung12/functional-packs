package me.xethh.utils.functionalPacks.tuples;

public class Tuple6<V1, V2, V3, V4, V5, V6> {
    public final V1 v1;
    public final V2 v2;
    public final V3 v3;
    public final V4 v4;
    public final V5 v5;
    public final V6 v6;

    private Tuple6(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
        this.v6 = v6;
    }

    public static <V1, V2, V3, V4, V5, V6> Tuple6<V1, V2, V3, V4, V5, V6> of(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6) {
        return new Tuple6<>(v1, v2, v3, v4, v5, v6);
    }
}
