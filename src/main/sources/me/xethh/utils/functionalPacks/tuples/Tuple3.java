package me.xethh.utils.functionalPacks.tuples;

public class Tuple3<V1, V2, V3> {
    public final V1 v1;
    public final V2 v2;
    public final V3 v3;

    private Tuple3(V1 v1, V2 v2, V3 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public static <V1, V2, V3> Tuple3<V1, V2, V3> of(V1 v1, V2 v2, V3 v3) {
        return new Tuple3<>(v1, v2, v3);
    }
}
