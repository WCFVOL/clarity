package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.Serializer;
import skadistats.clarity.decoder.s2.field.iface.Unpackable;
import skadistats.clarity.decoder.unpacker.Unpacker;

public class PointerField extends Field implements Unpackable {

    private final Unpacker<?> unpacker;
    private final Serializer serializer;

    public PointerField(FieldProperties fieldProperties, UnpackerProperties unpackerProperties, Unpacker<?> unpacker, Serializer serializer) {
        super(fieldProperties, unpackerProperties);
        this.unpacker = unpacker;
        this.serializer = serializer;
    }

    @Override
    public Field down(int i) {
        return serializer.getField(i);
    }

    @Override
    public Unpacker<?> getUnpacker() {
        return unpacker;
    }
}
