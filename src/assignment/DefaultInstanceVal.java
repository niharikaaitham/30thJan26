package assignment;

public class DefaultInstanceVal {
    // Instance variables of all primitive types (not initialized)
    //Outside any method, block, or constructor, and without the static keyword.
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    public static void main(String[] args) {
        DefaultInstanceVal defaultInstanceVal = new DefaultInstanceVal(); //created object
        int defaultByte=defaultInstanceVal.b;
        short defaultShort=defaultInstanceVal.s;  //objectName.variableName
        int defaultInt=defaultInstanceVal.i;
        long defaultLong =defaultInstanceVal.l;
        float defaultFloat=defaultInstanceVal.f;
        double defaultDouble=defaultInstanceVal.d;
        char defaultChar=defaultInstanceVal.c;
        boolean defaultBool=defaultInstanceVal.bool;
        System.out.println("Default byte value    : " + defaultByte);
        System.out.println("Default short value   : " + defaultShort);
        System.out.println("Default int value     : " + defaultInt);
        System.out.println("Default long value    : " + defaultLong);
        System.out.println("Default float value   : " + defaultFloat);
        System.out.println("Default double value  : " + defaultDouble);
        System.out.println("Default char value    : '" +defaultChar+ "'");
        System.out.println("Default boolean value : " + defaultBool);
    }
}
