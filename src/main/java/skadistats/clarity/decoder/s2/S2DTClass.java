package skadistats.clarity.decoder.s2;

import skadistats.clarity.decoder.s2.field.Field;
import skadistats.clarity.decoder.s2.field.FieldType;
import skadistats.clarity.decoder.s2.field.RecordField;
import skadistats.clarity.decoder.unpacker.Unpacker;
import skadistats.clarity.model.DTClass;
import skadistats.clarity.model.FieldPath;
import skadistats.clarity.model.s2.S2FieldPath;
import skadistats.clarity.model.state.EntityState;
import skadistats.clarity.model.state.EntityStateFactory;

public class S2DTClass implements DTClass {

    private final RecordField field;
    private int classId = -1;

    public S2DTClass(RecordField field) {
        this.field = field;
    }

    @Override
    public int getClassId() {
        return classId;
    }

    @Override
    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String getDtName() {
        return field.getSerializer().getId().getName();
    }

    public RecordField getField() {
        return field;
    }

    @Override
    public EntityState getEmptyState() {
        return EntityStateFactory.forS2(field.getSerializer());
    }

    @Override
    public String getNameForFieldPath(FieldPath fp) {
        throw new UnsupportedOperationException();
//        List<String> parts = new ArrayList<>();
//        serializer.accumulateName(fp.s2(), 0, parts);
//        StringBuilder b = new StringBuilder();
//        for (String part : parts) {
//            if (b.length() != 0) {
//                b.append('.');
//            }
//            b.append(part);
//        }
//        return b.toString();
    }

    public Unpacker getUnpackerForFieldPath(S2FieldPath fp) {
        throw new UnsupportedOperationException();
        //return serializer.getUnpackerForFieldPath(fp, 0);
    }

    public Field getFieldForFieldPath(S2FieldPath fp) {
        throw new UnsupportedOperationException();
        //return serializer.getFieldForFieldPath(fp, 0);
    }

    public FieldType getTypeForFieldPath(S2FieldPath fp) {
        throw new UnsupportedOperationException();
        //return serializer.getTypeForFieldPath(fp, 0);
    }

    @Override
    public S2FieldPath getFieldPathForName(String property) {
        throw new UnsupportedOperationException();
        //return serializer.getFieldPathForName(S2ModifiableFieldPath.newInstance(), property);
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", field.getSerializer().getId(), classId);
    }

}
