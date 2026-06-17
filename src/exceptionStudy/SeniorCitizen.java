package exceptionStudy;

public class SeniorCitizen {
    static void main(String[] args) {
        int age=70;
        if(age>65){
            throw new SeniorCitizenException("Cannot work");
        }
        else{
            System.out.println("Can Work");
        }
    }

}
