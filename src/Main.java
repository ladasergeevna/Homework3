//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task 1
        int i = -100357;
        byte b = 4;
        short s = 32000;
        long l= 4123456789987654321L;
        float f = 0.2121f;
        double d = 0.888888888;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        // Task 2
        float af = 27.12f;
        long bl = 987678965549L;
        float cf = 2.786f;
        short ds = 569;
        short es = -159;
        short fs = 27897;
        byte gb = 67;

        // Task 3
        int lp = 27;
        int as = 23;
        int ea = 30;
        int totalAmountP = 480;
        int totalAmountS = lp + as + ea;
        System.out.println("На каждого ученика рассчитано " + totalAmountP/ totalAmountS + " листов бумаги");

        // Task 4
        byte mt = 2; // Minutes
        byte bot = 16; // Amount of bottles
        int bm = bot/mt; //Кол-во бутылок в минуту
        int  mts = 20; // 20 минут
        int day = 24 * 60; // Кол-во минут в сутках
        int days = day * 3; // Кол-во минут в 3 сутках
        int month = day * 30; // Кол-во минут в месяце

        System.out.println("За 20 минут машина произвела " + bm * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bm * day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bm * days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bm * month + " штук бутылок");

        // Task 5
        byte totalAmountJars = 120; // Общее кол-во банок
        byte white = 2; // Кол-во белой краски на класс
        byte brown = 4; // Кол-во коричневой краски на класс
        int amountJarsForRoom = white + brown; // Всего краски на класс
        int amountRooms = totalAmountJars/amountJarsForRoom; // Кол-во классов
        int whiteForRooms = white * amountRooms; // Всего белой
        int brownForRoom = brown * amountRooms; // Всего коричневой
        System.out.println("В школе, где " + amountRooms +" классов, нужно " + whiteForRooms + " банок белой краски и " + brownForRoom +" банок коричневой краски");


        }
}