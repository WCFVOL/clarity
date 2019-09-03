package skadistats.clarity.decoder.s2.field.iface;

import skadistats.clarity.decoder.unpacker.Unpacker;

public interface Unpackable {
    Unpacker<?> getUnpacker();
}
