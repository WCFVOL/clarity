package skadistats.clarity.decoder.s2;

import skadistats.clarity.decoder.s2.field.Field2;

public class Serializer2 {

    private final SerializerId id;
    private final Field2[] fields;

    public Serializer2(SerializerId id, Field2[] fields) {
        this.id = id;
        this.fields = fields;
    }

    public SerializerId getId() {
        return id;
    }

    public int getFieldCount() {
        return fields.length;
    }

    public Field2 getField(int i) {
        return fields[i];
    }

}
