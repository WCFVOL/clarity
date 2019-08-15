package skadistats.clarity.decoder.s2;

public class MultiFieldOpCursor implements FieldOpCursor<Object> {

    private final FieldOpCursor[] cursors;

    public MultiFieldOpCursor(FieldOpCursor<?>... cursors) {
        this.cursors = cursors;
    }

    @Override
    public void down() {
        for (FieldOpCursor cursor : cursors) {
            cursor.down();
        }
    }

    @Override
    public void up(int n) {
        for (FieldOpCursor cursor : cursors) {
            cursor.up(n);
        }
    }

    @Override
    public int last() {
        return cursors[0].last();
    }

    @Override
    public void inc(int n) {
        for (FieldOpCursor cursor : cursors) {
            cursor.inc(n);
        }
    }

    @Override
    public void inc(int i, int n) {
        for (FieldOpCursor cursor : cursors) {
            cursor.inc(i, n);
        }
    }

    @Override
    public Object yield() {
        throw new UnsupportedOperationException();
    }

}
