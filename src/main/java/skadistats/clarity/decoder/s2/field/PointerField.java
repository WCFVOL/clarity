package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.Serializer2;
import skadistats.clarity.decoder.s2.field.iface.Unpackable;
import skadistats.clarity.decoder.unpacker.Unpacker;

public class PointerField extends Field2 implements Unpackable {

    private final Unpacker<?> unpacker;
    private final Serializer2 serializer;

    public PointerField(FieldProperties fieldProperties, UnpackerProperties unpackerProperties, Unpacker<?> unpacker, Serializer2 serializer) {
        super(fieldProperties, unpackerProperties);
        this.unpacker = unpacker;
        this.serializer = serializer;
    }

    @Override
    public Field2 down(int i) {
        return serializer.getField(i);
    }

    @Override
    public Unpacker<?> getUnpacker() {
        return unpacker;
    }
}
