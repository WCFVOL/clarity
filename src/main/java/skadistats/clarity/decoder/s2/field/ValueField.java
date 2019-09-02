package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.unpacker.Unpacker;

public class ValueField extends Field2 {

    private final Unpacker<?> unpacker;

    public ValueField(FieldProperties fieldProperties, Unpacker<?> unpacker) {
        super(fieldProperties);
        this.unpacker = unpacker;
    }

}
