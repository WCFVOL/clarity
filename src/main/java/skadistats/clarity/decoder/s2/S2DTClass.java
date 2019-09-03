package skadistats.clarity.decoder.s2;

import skadistats.clarity.decoder.s2.field.Field;
import skadistats.clarity.decoder.s2.field.FieldType;
import skadistats.clarity.decoder.s2.field.RecordField;
import skadistats.clarity.decoder.s2.field.iface.Unpackable;
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
        return EntityStateFactory.forS2(field);
    }

    @Override
    public String getNameForFieldPath(FieldPath fpX) {
        S2FieldPath fp = fpX.s2();
        Field f = field;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= fp.last(); i++) {
            int fi = fp.get(i);
            f = f.down(fi);
            if (i != 0) {
                sb.append('.');
            }
            sb.append(f.getFieldProperties().getName(fi));
        }
        return sb.toString();
    }

    public Unpacker getUnpackerForFieldPath(S2FieldPath fp) {
        Field f = field;
        for (int i = 0; i <= fp.last(); i++) {
            f = f.down(fp.get(i));
        }
        return ((Unpackable) f).getUnpacker();
    }

    public Field getFieldForFieldPath(S2FieldPath fp) {
        Field f = field;
        for (int i = 0; i <= fp.last(); i++) {
            f = f.down(fp.get(i));
        }
        return f;
    }

    public FieldType getTypeForFieldPath(S2FieldPath fp) {
        Field f = field;
        for (int i = 0; i <= fp.last(); i++) {
            f = f.down(fp.get(i));
        }
        return f.getFieldProperties().getType();
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
