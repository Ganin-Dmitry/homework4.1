public class Main {
    public static void main(String[] args) {

        //Задача 1
        int age = 19;
        if (age > 17) {
            System.out.println("Если человеку " + age + " лет, то он совершеннолетний.");
        } else {
            System.out.println("Если человеку " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать.");
        }

        //Задача 2
        int temp = 23;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        }

        //Задача 3
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        //Задача 4
        age = 15;
        if (age >= 1 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }

        //Задача 5
        age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе в сопровождении взрослого.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракцоне без сопровождения взрослого.");
        }

        //Задача 6
        int person = 85;
        int lots = 102;
        int seatLots = 60;
        if (person > lots) {
            System.out.println("В вагоне не осталось мест.");
        } else {
            if (person >= 60) {
                System.out.println("В вагоне осталось " + (lots - person) + " стоячих мест.");
            } else {
                System.out.println("В ваоне осталось " + (seatLots - person) + " сидячих мест и " + (lots - seatLots) + " стоячих.");
            }
        }

        //Задача 7
        int one = 5;
        int two = 4;
        int three = 6;
        if (one > two) {
            if (one > three) {
                System.out.println("Число one, равное " + one + ", большее.");
            } else {
                System.out.println("Число three, равное " + three + ", большее.");
            }
        } else {
            if (two > three) {
                System.out.println("Число two, равное " + two + ", большее.");
            } else {
                System.out.println("Число three, равное " + three + ", большее.");
            }
        }

    }
}