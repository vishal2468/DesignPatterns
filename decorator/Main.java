package decorator;

public class Main {
    public static void main(String[] args) {
        Beverage b = new Ceramel(new Ceramel(new Espresso()));
        System.out.println(b.cost());
    }
}
