package skadistats.clarity.decoder.s2.field.impl;

import skadistats.clarity.decoder.s2.field.FieldProperties;
import skadistats.clarity.decoder.s2.field.Unpackable;
import skadistats.clarity.decoder.s2.field.UnpackerProperties;
import skadistats.clarity.decoder.unpacker.Unpacker;

public class ValueField extends Field implements Unpackable {

    private final Unpacker<?> unpacker;

    public ValueField(FieldProperties fieldProperties, UnpackerProperties unpackerProperties, Unpacker<?> unpacker) {
        super(fieldProperties, unpackerProperties);
        this.unpacker = unpacker;
    }

    @Override
    public Field down(int i) {
        return null;
    }

    @Override
    public Unpacker<?> getUnpacker() {
        return unpacker;
    }

}
