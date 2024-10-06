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
        System.out.println();

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
        int mts = 20; // 20 минут
        int day = 24 * 60; // Кол-во минут в сутках
        int days = day * 3; // Кол-во минут в 3 сутках
        int month = day * 30; // Кол-во минут в месяце

        System.out.println();
        System.out.println("За 20 минут машина произвела " + bm  * mts + " штук бутылок");
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

        System.out.println();
        System.out.println("В школе, где " + amountRooms +" классов, нужно " + whiteForRooms + " банок белой краски и " + brownForRoom +" банок коричневой краски");

        // Task 6
        /* Вес одной единицы продукта, г*/
        double weightBanana = 80;
        double weightMilk = 105;
        double weightIceCream = 100;
        double weightEgg = 70;
        /*Количество продуктов*/
        int amountBanana = 5;
        int amountMilk = 2;
        int amountIceCream = 2;
        int amountEgg = 4;

        double weightBreakfastG = weightBanana * amountBanana + weightMilk * amountMilk + weightIceCream * amountIceCream + weightEgg * amountEgg;
        double weightBreakfastKg = weightBreakfastG / 1000;

        System.out.println();
        System.out.println("Вес спортзавтрака составляет " + weightBreakfastG + " грамм (" + weightBreakfastKg + " килограмм)" );

        // Task 7
        int minLossWeightG = 250;
        int maxLossWeightG = 500;
        int totalLossWeightG = 7000;

        int daysForLoss1 = totalLossWeightG/minLossWeightG;
        int daysForLoss2 = totalLossWeightG/maxLossWeightG;
        int daysForLossAverage = (daysForLoss1 + daysForLoss2)/2;

        System.out.println();
        System.out.println("Если спортсмен будет терять каждый день по " + minLossWeightG +" грамм, то потребуется " + daysForLoss1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + maxLossWeightG +" грамм, то потребуется " + daysForLoss2 + " дней");
        System.out.println("В среднем для похудения нужно " + daysForLossAverage + " дней");

        // Task 8

        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;
        double indexPercent = 0.1;

        double mashaNewSalary = mashaSalary + mashaSalary * indexPercent;
        double denisNewSalary = denisSalary + denisSalary * indexPercent;
        double kristinaNewSalary = kristinaSalary + kristinaSalary * indexPercent;

        double mashaYearsIncome = mashaSalary * 12;
        double denisYearsIncome = denisSalary * 12;
        double kristinaYearsIncome = kristinaSalary * 12;

        double mashaNewYearsIncome = mashaNewSalary * 12;
        double denisNewYearsIncome = denisNewSalary * 12;
        double kristinaNewYearsIncome = kristinaNewSalary * 12;

        double mashaYearsIncomeDif = mashaNewYearsIncome - mashaYearsIncome;
        double denisYearsIncomeDif = denisNewYearsIncome - denisYearsIncome;
        double kristinaYearsIncomeDif = kristinaNewYearsIncome - kristinaYearsIncome;

        System.out.println();
        System.out.println("После повышения Маша будет получать " + mashaNewSalary + " рублей в месяц. Годовой доход вырастет на " + mashaYearsIncomeDif +" рублей");
        System.out.println("После повышения Денис будет получать " + denisNewSalary + " рублей в месяц. Годовой доход вырастет на " + denisYearsIncomeDif +" рублей");
        System.out.println("После повышения Кристина будет получать " + kristinaNewSalary + " рублей в месяц. Годовой доход вырастет на " + kristinaYearsIncomeDif +" рублей");
    }
}