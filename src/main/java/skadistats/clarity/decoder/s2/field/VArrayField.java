package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.field.iface.Unpackable;
import skadistats.clarity.decoder.unpacker.Unpacker;

public class VArrayField extends Field2 implements Unpackable {

    private final Unpacker<?> unpacker;
    private final Field2 elementField;

    public VArrayField(FieldProperties fieldProperties, UnpackerProperties unpackerProperties, Unpacker<?> unpacker, Field2 elementField) {
        super(fieldProperties, unpackerProperties);
        this.unpacker = unpacker;
        this.elementField = elementField;
    }

    @Override
    public Field2 down(int i) {
        return elementField;
    }

    @Override
    public Unpacker<?> getUnpacker() {
        return unpacker;
    }

}
