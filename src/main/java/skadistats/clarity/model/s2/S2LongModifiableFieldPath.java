package skadistats.clarity.model.s2;

import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class S2LongModifiableFieldPath implements S2ModifiableFieldPath<S2LongModifiableFieldPath> {

    private long id;

    @Override
    public void set(int i, int v) {
        id = S2LongFieldPathFormat.set(id, i, v);
    }

    @Override
    public int get(int i) {
        return S2LongFieldPathFormat.get(id, i);
    }

    @Override
    public void down() {
        id = S2LongFieldPathFormat.down(id);
    }

    @Override
    public void up(int n) {
        id = S2LongFieldPathFormat.up(id, n);
    }

    @Override
    public int last() {
        return S2LongFieldPathFormat.last(id);
    }

    @Override
    public void incAll(IntPredicate pred, IntSupplier work) {
        int n = last();
        for (int i = 0; i <= n; i++) {
            if (pred.test(i)) {
                inc(i, work.getAsInt());
            }
        }
    }

    @Override
    public S2FieldPath yield() {
        return new S2LongFieldPath(id);
    }

    @Override
    public String toString() {
        return asString();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof S2LongModifiableFieldPath) {
            return id == ((S2LongModifiableFieldPath) o).id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return S2LongFieldPathFormat.hashCode(id);
    }

    @Override
    public int compareTo(S2LongModifiableFieldPath o) {
        return S2LongFieldPathFormat.compareTo(id, o.id);
    }

}
