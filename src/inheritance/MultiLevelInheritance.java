package inheritance;

public class MultiLevelInheritance {
    static void main(String[] args) {
        Country country = new Country();
        State state = new State();
        City city = new City();

        System.out.println(city.Name);
        System.out.println("==================================");
        city.Capital();
        System.out.println(country.Name);



    }
}