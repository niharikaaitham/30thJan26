package stringPackage;

public class StringBufferBuilderStudy {
    static void main(String[] args) {
        //name is original object and cannot make any changes to original object
        String name="Niha"; //String is a non-primitive dataType and a class
        name=name+"Aitham"; //need to assign to the original String-->immutable
//        name.append;
       String name1=name.replace("N","n");
        System.out.println(name);
        System.out.println(name1);

        //String buffer and string builders are classes
//String buffer is a mutable class, we can modify objects
        StringBuffer city=new StringBuffer("Hyderabad");
        System.out.println(city);
        city.append("-Hyd"); //append-->method  //without assignment/storing , originality changed-->mutable
        city.replace(0,1,"h");
        System.out.println(city);
        System.out.println(city.reverse());

        StringBuffer word=new StringBuffer("Java Selenium");
        word.append(" Testing");
        System.out.println(word);
        word.insert(0,"new");
        System.out.println(word);
        word.delete(0,3); //should add+1 for index in delete method
        System.out.println(word);
        word.capacity();
        System.out.println(word);




        System.out.println("==================================================");
    }
}
