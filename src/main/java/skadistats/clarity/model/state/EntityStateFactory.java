package skadistats.clarity.model.state;

import skadistats.clarity.decoder.s1.ReceiveProp;
import skadistats.clarity.decoder.s2.Serializer2;

public class EntityStateFactory {

    public static EntityState forS1(ReceiveProp[] receiveProps) {
        return new ObjectArrayEntityState(receiveProps.length);
    }

    public static NestedArrayEntityState forS2(Serializer2 serializer) {
        return new NestedArrayEntityState(serializer);
        //return new TreeMapEntityState();
    }

}
