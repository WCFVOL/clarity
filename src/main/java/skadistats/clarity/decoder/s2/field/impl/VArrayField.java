package skadistats.clarity.decoder.s2.field.impl;

import skadistats.clarity.decoder.s2.field.FieldProperties;
import skadistats.clarity.decoder.s2.field.Unpackable;
import skadistats.clarity.decoder.s2.field.UnpackerProperties;
import skadistats.clarity.decoder.unpacker.Unpacker;

public class VArrayField extends Field implements Unpackable {

    private final Unpacker<?> unpacker;
    private final Field elementField;

    public VArrayField(FieldProperties fieldProperties, UnpackerProperties unpackerProperties, Unpacker<?> unpacker, Field elementField) {
        super(fieldProperties, unpackerProperties);
        this.unpacker = unpacker;
        this.elementField = elementField;
    }

    @Override
    public Field down(int i) {
        return elementField;
    }

    @Override
    public Unpacker<?> getUnpacker() {
        return unpacker;
    }

}
