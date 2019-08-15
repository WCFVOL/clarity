package skadistats.clarity.decoder.s2;

import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public interface FieldOpCursor<Y> {

    void down();

    void up(int n);

    int last();

    void inc(int n);

    void incAll(IntPredicate pred, IntSupplier work);

    Y yield();

}
