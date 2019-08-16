package skadistats.clarity.decoder.s2;

public interface FieldOpCursor<Y> {

    void down();

    void up(int n);

    int last();

    void inc(int i, int n);

    default void inc(int n) {
        inc(last(), n);
    }

    Y yield();

    interface Delegate<Y, D extends Delegate> {
        D down(int i);
        Y yield();
    }

}
