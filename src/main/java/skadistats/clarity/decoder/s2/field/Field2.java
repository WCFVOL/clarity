package skadistats.clarity.decoder.s2.field;

public abstract class Field2 {

    protected final FieldProperties fieldProperties;

    public Field2(FieldProperties fieldProperties) {
        this.fieldProperties = fieldProperties;
    }

    public FieldProperties getFieldProperties() {
        return fieldProperties;
    }

    public UnpackerProperties getUnpackerProperties() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return fieldProperties.getName(0) + "(" + fieldProperties.getType() + ")";
    }

}
