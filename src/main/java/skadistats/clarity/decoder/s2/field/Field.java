package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.field.iface.DownFunction;

public abstract class Field implements DownFunction<Field> {

    protected final FieldProperties fieldProperties;
    protected final UnpackerProperties unpackerProperties;

    public Field(FieldProperties fieldProperties, UnpackerProperties unpackerProperties) {
        this.fieldProperties = fieldProperties;
        this.unpackerProperties = unpackerProperties;
    }

    public FieldProperties getFieldProperties() {
        return fieldProperties;
    }

    public UnpackerProperties getUnpackerProperties() {
        return unpackerProperties;
    }

    public String toString() {
        return fieldProperties.getName(0) + "(" + fieldProperties.getType() + ")";
    }

}
