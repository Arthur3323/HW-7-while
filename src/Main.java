public class Main {
    public static void main(String[] args) {


        //Task 1
        System.out.println("Задача 1 : ");
        int savings = 15_000;
        int needSavings = 2_459_000;
        int month = 0;
        int total = 0;
        String textBeginning = "Месяц ";
        String textMiddle = ", сумма накоплений равна ";
        String textEnd = " рублей";
        while (total <= needSavings) {
            total += savings;
            month++;

            System.out.println(textBeginning + month + textMiddle + total + textEnd);
        }

        //Task 2
        System.out.println("\nЗадача 2 : ");

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }

        //Task 3
        System.out.println("\nЗадача 3 : ");
        int populationContry = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int cycle = 0;
        int increase;
        int thousand = 1000;

        textBeginning = "Год ";
        textMiddle = ", численность населения составляет ";

        while (cycle < 10) {
            cycle++;
            increase = (populationContry / thousand * birthRate) - (populationContry / thousand * mortalityRate);
            populationContry += increase;

            System.out.println(textBeginning + cycle + textMiddle + populationContry);
        }

        //Task 4
        System.out.println("\nЗадача 4 : ");

        increase = 7;
        needSavings = 12_000_000;
        month = 0;
        total = 0;

        textBeginning = "Месяц ";
        textMiddle = ", сумма накоплений равна ";
        textEnd = " рублей";

        while (total <= needSavings) {
            total += (total / 100 * increase);
            total += savings;
            month++;

            System.out.println(textBeginning + month + textMiddle + total + textEnd);
        }

        //Task 5
        System.out.println("\nЗадача 5 : ");

        month = 0;
        total = 0;
        while (total <= needSavings) {
            total += (total / 100 * increase);
            total += savings;
            month++;
            if (month % 6 == 0) {
                System.out.println(textBeginning + month + textMiddle + total + textEnd);
            }
        }

        //Task 6
        System.out.println("\nЗадача 6 : ");

        month = 0;
        total = 0;
        int termSavingsYear = 9;
        int monthsOfYear = 12;
        int totalTermSavings = termSavingsYear * monthsOfYear;

        while (month <= totalTermSavings) {
            total += (total / 100 * increase);
            total += savings;
            month++;
            if (month % 6 == 0) {
                System.out.println(textBeginning + month + textMiddle + total + textEnd);
            }
        }


        //Task 7
        System.out.println("\nЗадача 7 : ");

        int dayFirstFriday = 5;

        int maxDayOfMonth = 31;
        int friday = dayFirstFriday;

        textBeginning = "Сегодня пятница, ";
        textEnd = "-е число.Необходимо подготовить отчет";


        while (friday <= maxDayOfMonth) {

            System.out.println(textBeginning + friday + textEnd);
            friday += 7;
        }


        //Task 8
        System.out.println("\nЗадача 8 : ");

        int cometFlying = 79;
        int currentYear = 2024;
        int cometFlyingYear = 0;


        int beforePeriod = currentYear - 200;
        int afterPeriod = currentYear + 100;
        while ( cometFlyingYear  <=  afterPeriod ) {

            if ( beforePeriod <= cometFlyingYear) {
                System.out.println(cometFlyingYear);
            }
            cometFlyingYear += cometFlying;
        }

    }
}

