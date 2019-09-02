package skadistats.clarity.decoder.s2.field;

import skadistats.clarity.decoder.s2.Serializer;

public interface FieldProperties {

    FieldType getType();
    String getName(int i);
    Serializer getSerializer();

}
