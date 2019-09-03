package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.Serializer2;

public class RecordField extends Field2 {

    private final Serializer2 serializer;

    public RecordField(FieldProperties fieldProperties, Serializer2 serializer) {
        super(fieldProperties, null);
        this.serializer = serializer;
    }

    public Serializer2 getSerializer() {
        return serializer;
    }

    @Override
    public Field2 down(int i) {
        return serializer.getField(i);
    }

}
