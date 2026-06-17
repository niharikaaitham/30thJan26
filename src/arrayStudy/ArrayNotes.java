package arrayStudy;

public class ArrayNotes {
    /*Array is a concept and arrays is a class
    Array is nothing but an object.
    -Data Structure used to store homogenous collection of information
    -Array is a Final class - cannot be inherited/extended
    -All the methods are static.
    -they are not growable in nature.
    -Capacity is fixed.
    -Inside array index will be present and starts from 0.
    -If we try to print an array out of the boundary, we get ArrayIndexOutOfBoundaryException.
    -we use length as a global variable in for loop not a method|(length()).
    -If we do not declare any value in index, the return value will be null

Syntax of ARRAY ->

	int a[]={10,20,30,40};        // when values are known...
	         0  1  2  3   => Index

	int a[] = new int[4];        // when values are unknown...

	Here, 4 is length of array
	array index starts with 0 and ends with 3 here..
	a[0]   -> array index starts..
	 |
	 |
	 |
	a[3]   -> array index ends.

//	1.can we initialize array with element size 0 or zeroth array index ?

		int a[]=new int[0];
//		System.out.println(a[0]);  (ArrayIndexOutOfBoundsException)

//  ANS -> Yes.java allows creating an array of size zero.you will not be able
//		   to store any element

//	2.Can we initialize array with negative element size

		int b[]=new int[-5];
//      System.out.println(b[-4]);

//  ANS -> No. At the time of execution JVM will throw exception (NegativeArraySizeExcp)

//  3.  int c[]=new int[]    // will show error bcz we have not given any size to array.

Disadvantage:
In Array,we can store multiple data of same data type.We can not use data of different
    data types. This is the disadvantage of Array. Solution to that is Object Array.

	Object Array is Heterogeneous means we can use multiple data of diff data types.

	Object Array -> When we use the Object Array then we can store multiple data
	                of different data type.



     */
}
