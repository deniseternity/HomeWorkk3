
    public static void main(String[] args) {
        int a = 100000;
        byte b= 100;
        short c = 10000;
        long d = 1000000L;
        float e = 3;
        double f = 200000;
        System.out.println("Значение переменной a с типом" + int + "равно" + a +)
        System.out.println("Значение переменной b с типом" + byte + "равно" + b +)
        System.out.println("Значение переменной c с типом" + short + "равно" + c +)
        System.out.println("Значение переменной d с типом" + long + "равно" + d +)
        System.out.println("Значение переменной e с типом" + float + "равно" + e +)
        System.out.println("Значение переменной f с типом" + double + "равно" + f +)

        float a = 27.12;
        long b = 987678965549;
        float c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        short paper = 480;
        byte teacherL = 23;
        byte teacherA = 27;
        byte teacherE = 30;
        short allStudent = (short) (teacherE + teacherA + teacherL);
        short oneStuddentPaper = (short) (paper / allStudent);
        System.out.println("На каждого ученика рассчитано" + oneStuddentPaper + "листов бумаги");

        short bottle = 16;
        short time = 2;
        short oneBottleInOneMinute = bottle / time;
        short a = 20;
        short endBottle1 = a * oneBottleInOneMinute;
        short b = 1440;
        short endBottle2 = b * oneBottleInOneMinute;
        short c = 4320;;
        short endBottle3 = c * oneBottleInOneMinute;
        int d = 40320;
        int endBottle4 = (int) d * (short) oneBottleInOneMinute;
        System.out.println("За" + a + "Машина произвела" + endBottle1 + "бутылок");
        System.out.println("За" + b + "Машина произвела" + endBottle2 + "бутылок");
        System.out.println("За" + c + "Машина произвела" + endBottle3 + "бутылок");
        System.out.println("За" + d + "Машина произвела" + endBottle4 + "бутылок")

        short allColor = 120;
        short whiteColor = 2;
        short brownColor = 4;
        short colorForClass = whiteColor + brownColor
        short allClass = allColor / colorForClass;
        short sellBrown = brownColor * allClass;
        short sellWhite = whiteColor * allClass;
        System.out.println("В школе,где" + allClass + "классов,нужно" + sellWhite + "банок белой краски и" + sellBrown + ",банок коричневой краски");

        short banana = 5;
        short oneBanana = 80;
        short allWtBanana = banana * oneBanana;
        short milk = 200;
        short hundredMl = 105;
        float allWtMilk = (float)milk * hundredMl / 100
        short iceCream = 2;
        short oneBricket = 100;
        short allWtIceCream = iceCream * oneBricket;
        short egg = 4;
        short oneEgg = 70;
        short allWtEgg = oneEgg * egg;
        float allWtG = (float) (allWtBanana + allWtMilk + allWtIceCream + allWtEgg);
        short oneKg = 1000;
        float allWtKg = (float) (allWtG / oneKg);
        System.out.println("Вес спортзавтрака" + allWtG + "грамм и" + allWtKg + "киллограмм");

        short oneDay1 = 250;;
        short oneDay2 = 500;
        short needKg = 7
        short oneKg = 1000
        short needG = needKg * oneKg;
        short needDay1 = needG / oneDay1;
        short needDay2 = needG / oneDay2;
        short difference = oneDay2 - oneDay1;
        short middle = 2;
        short average = oneDay2 - oneDay1;
        short oneDay3 = average / middle + oneDay1;
        short needDay3 = needG / oneDay3;
        System.out.println("Если каждый день терять по" + oneDay1 + "грамм,то уйдет" + needDay1 + "дней");
        System.out.println("Если каждый день терять по" + oneDay2 + "грамм,то уйдет" + needDay2 + "дней");
        System.out.println("Если каждый день терять по" + oneDay3 + "грамм,то уйдет" + needDay3 + "дней");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int oneYear = 12;
        int tenProcent = 10;

        int salaryMashaOneYear = salaryMasha * oneYear;
        float newSalaryMashaOneYear = (float)salaryMashaOneYear / 100 * tenProcent;
        float differenceMasha = newSalaryMashaOneYear - salaryMashaOneYear;

        int salaryDenisOneYear = salaryDenis * oneYear;
        float newSalaryDenisOneYear = (float)salaryDenisOneYear / 100 * tenProcent;
        float differenceDenis = newSalaryDenisOneYear - salaryDenisOneYear;

        int salaryKristinaOneYear = salaryKristina * oneYear;
        float newSalaryKristinaOneYear = (float)salaryKristinaOneYear / 100 * tenProcent;
        float differenceKristina = newSalaryKristinaOneYear - salaryKristinaOneYear;
        System.out.println("Маша теперь получает" + newSalaryMashaOneYear + "рублей. Годовой доход вырос на" + differenceMasha + "рублей");
        System.out.println("Денис теперь получает" + newSalaryDenisOneYear + "рублей. Годовой доход вырос на" + differenceDenis + "рублей")
        System.out.println("Кристина теперь получает" + newSalaryKristinaOneYear + "рублей. Годовой доход вырос на" + differenceKristina + "рублей");