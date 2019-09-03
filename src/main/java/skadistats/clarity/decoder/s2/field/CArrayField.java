package skadistats.clarity.decoder.s2.field;

public class CArrayField extends Field {

    private final Field elementField;

    public CArrayField(FieldProperties fieldProperties, Field elementField, int length) {
        super(fieldProperties, null);
        this.elementField = elementField;
    }

    @Override
    public Field down(int i) {
        return elementField;
    }
}
