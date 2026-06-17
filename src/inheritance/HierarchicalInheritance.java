package inheritance;

public class HierarchicalInheritance {
    static void main(String[] args) {
        Mother mother=new Mother();
        Son son=new Son();
        Daughter daughter=new Daughter();
        mother.nature();
        son.nature();
        son.mobile();
        System.out.println("Son's bloodgroup inherited from mom is "+son.bloodGroup);
        System.out.println(Son.language);

        Daughter.height();
        daughter.nature();
        System.out.println(daughter.hair);
        System.out.println("Daughter's bloodgroup inherited from mom is "+daughter.bloodGroup);


    }
}
