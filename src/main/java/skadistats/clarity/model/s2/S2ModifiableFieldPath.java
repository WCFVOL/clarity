package skadistats.clarity.model.s2;

import skadistats.clarity.decoder.s2.FieldOpCursor;

public interface S2ModifiableFieldPath<F extends S2FieldPath> extends S2FieldPath<F>, FieldOpCursor<S2FieldPath> {

    static S2ModifiableFieldPath newInstance() {
        return new S2LongModifiableFieldPath();
    }

    void set(int i, int v);

    S2FieldPath yield();

    default void inc(int i, int n) {
        set(i, get(i) + n);
    }

    default void inc(int n) {
        inc(last(), n);
    }

    default void cur(int v) {
        set(last(), v);
    }

    default int cur() {
        return get(last());
    }

}
