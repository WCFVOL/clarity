package skadistats.clarity.decoder.s2.field.impl;

import skadistats.clarity.decoder.s2.Serializer;
import skadistats.clarity.decoder.s2.field.FieldProperties;

public class RecordField extends Field {

    private final Serializer serializer;

    public RecordField(FieldProperties fieldProperties, Serializer serializer) {
        super(fieldProperties, null);
        this.serializer = serializer;
    }

    public Serializer getSerializer() {
        return serializer;
    }

    @Override
    public Field down(int i) {
        return serializer.getField(i);
    }

}
