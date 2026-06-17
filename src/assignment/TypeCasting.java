package assignment;

public class TypeCasting {
   //program that demonstrates type casting (both implicit and explicit).
   public static void main(String[] args) {

       int intVal = 100;
       long longVal = intVal;
       float floatVal = longVal;

       System.out.println("===================================");
       System.out.println("int value   : " + intVal);
       System.out.println("long value  : " + longVal);
       System.out.println("float value : " + floatVal);

       double doubleVal = 6.23;
       int intFromDouble = (int) doubleVal;
       byte byteFromInt = (byte) intFromDouble;

       System.out.println("===================================");
       System.out.println("double value        : " + doubleVal);
       System.out.println("int from double     : " + intFromDouble);
       System.out.println("byte from that int  : " + byteFromInt);
   }
}

