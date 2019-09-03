package skadistats.clarity.decoder.s2.field;

public class CArrayField extends Field2 {

    private final Field2 elementField;

    public CArrayField(FieldProperties fieldProperties, Field2 elementField, int length) {
        super(fieldProperties, null);
        this.elementField = elementField;
    }

    @Override
    public Field2 down(int i) {
        return elementField;
    }
}
