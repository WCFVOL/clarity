package skadistats.clarity.decoder.s2.field;

public interface UnpackerProperties {

    Integer getEncodeFlags();
    Integer getBitCount();
    Float getLowValue();
    Float getHighValue();
    String getEncoderType();

    int getEncodeFlagsOrDefault(int defaultValue);
    int getBitCountOrDefault(int defaultValue);
    float getLowValueOrDefault(float defaultValue);
    float getHighValueOrDefault(float defaultValue);

}
