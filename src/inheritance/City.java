package inheritance;

public class City extends State{
    String Name="Hyderabad";

    public void Capital() {
        System.out.println("Capital of Hyderabad is "+super.Name);
    }

}
