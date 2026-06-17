package variableStudy;

public class ConstructoyStudyP {
    static void main(String[] args) {
        ConstructoyStudyP b=new ConstructoyStudyP(1,2);

        //we're creating a constructor with parameters
        //there is no method here so no need of method calling
    }
    public ConstructoyStudyP(int age, int rollNumber){ //constructor name same as class name
        System.out.println(age);
        System.out.println(rollNumber);

    }
}
