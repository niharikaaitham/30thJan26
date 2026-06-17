package inheritance;

public class State extends Country{
    String Name="Telangana";
    String chiefMinister="Revanth Reddy";

    public void primeMinister() {
        System.out.println(super.primeMinister);
    }

    public void Capital() {
        System.out.println("Capital of Telangana is "+super.Name);
    }
}
