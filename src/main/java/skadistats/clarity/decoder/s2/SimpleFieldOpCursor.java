package skadistats.clarity.decoder.s2;

import skadistats.clarity.model.s2.S2FieldPath;
import skadistats.clarity.model.s2.S2ModifiableFieldPath;

public class SimpleFieldOpCursor<Y> implements FieldOpCursor<Y> {

    private final S2ModifiableFieldPath fp = S2ModifiableFieldPath.newInstance();
    private final Delegate[] delegates = new Delegate[5];
    private int valid = 0;

    public SimpleFieldOpCursor(Delegate<Y> delegate) {
        delegates[fp.last()] = delegate;
    }

    @Override
    public void inc(int i, int n) {
        fp.inc(i, n);
        if (valid > i) {
            valid = i;
        }
    }

    @Override
    public void down() {
        fp.down();
    }

    @Override
    public void up(int n) {
        fp.up(n);
    }

    @Override
    public int last() {
        return fp.last();
    }

    public S2FieldPath getFieldPath() {
        return fp.yield();
    }

    @Override
    public Y yield() {
        int len = fp.last();
        if (valid < len) {
            for (int i = valid; i < len; i++) {
                delegates[i + 1] = delegates[i].down(fp.get(i));
            }
        }
        valid = len;
        Object yield = delegates[fp.last()].down(fp.cur()).yield();
        return (Y) yield;
    }

    @Override
    public String toString() {
        return fp.toString();
    }

}
