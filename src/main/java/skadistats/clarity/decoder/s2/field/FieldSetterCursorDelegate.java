package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.FieldOpCursor;
import skadistats.clarity.model.state.ArrayEntityState;

import java.util.function.Function;
import java.util.function.IntFunction;

public interface FieldSetterCursorDelegate extends FieldOpCursor.Delegate<Function<ArrayEntityState.Accessor, FieldSetter>, FieldSetterCursorDelegate> {

    static FieldSetterCursorDelegate create(Function<ArrayEntityState.Accessor, FieldSetter> fieldSetterFunction) {
        return  create(fieldSetterFunction, i -> { throw new UnsupportedOperationException(); });
    }

    static FieldSetterCursorDelegate create(Function<ArrayEntityState.Accessor, FieldSetter> fieldSetterFunction, IntFunction<FieldSetterCursorDelegate> nextDownFunction) {
        return new FieldSetterCursorDelegate() {
            @Override
            public FieldSetterCursorDelegate down(int i) {
                return nextDownFunction.apply(i);
            }

            @Override
            public Function<ArrayEntityState.Accessor, FieldSetter> yield() {
                return fieldSetterFunction;
            }
        };
    }

}
