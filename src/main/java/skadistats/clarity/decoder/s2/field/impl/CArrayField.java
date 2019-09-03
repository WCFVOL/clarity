package skadistats.clarity.decoder.s2.field.impl;

import skadistats.clarity.decoder.s2.field.FieldProperties;

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
