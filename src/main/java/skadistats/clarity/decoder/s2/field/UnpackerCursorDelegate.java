package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.FieldOpCursor;
import skadistats.clarity.decoder.unpacker.Unpacker;

import java.util.function.IntFunction;

public interface UnpackerCursorDelegate extends FieldOpCursor.Delegate<Unpacker> {

    static UnpackerCursorDelegate create(Unpacker unpacker) {
        return create(unpacker, i -> { throw new UnsupportedOperationException(); });
    }

    static UnpackerCursorDelegate create(Unpacker unpacker, UnpackerCursorDelegate nextDown) {
        return create(unpacker, i -> nextDown);
    }

    static UnpackerCursorDelegate create(Unpacker unpacker, IntFunction<UnpackerCursorDelegate> nextDownFunction) {
        return new UnpackerCursorDelegate() {
            @Override
            public FieldOpCursor.Delegate<Unpacker> down(int i) {
                return nextDownFunction.apply(i);
            }
            @Override
            public Unpacker yield() {
                return unpacker;
            }
        };
    }

}
