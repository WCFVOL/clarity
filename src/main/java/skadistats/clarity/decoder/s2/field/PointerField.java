package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.Serializer2;
import skadistats.clarity.decoder.unpacker.Unpacker;

public class PointerField extends Field2 {

    private final Unpacker<?> unpacker;
    private final Serializer2 serializer;

    public PointerField(FieldProperties fieldProperties, Unpacker<?> unpacker, Serializer2 serializer) {
        super(fieldProperties);
        this.unpacker = unpacker;
        this.serializer = serializer;
    }

}
