package casting;

public class Intro {
    /*                             * TYPE CASTING *

    Type Casting in java refers to converting one type of data into another..

    Types of Casting =>

 1. Upcasting / Implicit Casting/ Widening =>
          Implicit casting happens automatically when you assign a smaller data type value
     to a larger data type. This is known as widening,
     There is no risk of losing data.

     Byte → Short → Int → Long → Float → Double:

     Smaller types can be automatically converted to larger types.

     parentclass refvar=new childclass();

     Here,we are creating object of child class with the reference of parent class
	 means only those methods will be called which are present in parent class only..

 2. DownCasting / Explicit Casting / Narrowing
          Explicit casting is required when you want to assign a larger data type to a
     smaller data type. This is known as narrowing, and it requires the programmer to
     manually specify the conversion.

     Double → Float → Long → Int → Short → Byte:

     Larger types can be manually converted to smaller types, but there's a risk of data loss

   	 Childclass refvar=new parentclass();

   	 Syntax is correct but jvm will throw exception at the time of execution..
*/
}
