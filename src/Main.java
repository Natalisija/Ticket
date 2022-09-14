public class Main {
    public static void main(String[] args) {

        int z = 2000; // стоимость билета

        int y = 20; // количество рублей для одной бонусной милли
        int x = z / y; // количество бонусных милль

        System.out.println("Количество бонусных милль с одного билета:");
        System.out.println((z / y) + " милль ");

    }
}
