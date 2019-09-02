package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.unpacker.Unpacker;

public class VArrayField extends Field2 {

    private final Unpacker<?> unpacker;
    private final Field2 elementField;

    public VArrayField(FieldProperties fieldProperties, Unpacker<?> unpacker, Field2 elementField) {
        super(fieldProperties);
        this.unpacker = unpacker;
        this.elementField = elementField;
    }

}
