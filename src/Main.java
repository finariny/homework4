public class Main {
    public static void main(String[] args) {
        //homework 1
        System.out.println("Homework 1");

        //task 1
        System.out.println("Task 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //task 2
        System.out.println("Task 2");
        int personAge = 9;
        if (personAge >= 7 && personAge < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (personAge >= 18 && personAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (personAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //task 3
        System.out.println("Task 3");
        int wagonCapacity = 102;
        int seatingPlaceCount = 60;
        int standingPlaceCount = wagonCapacity - seatingPlaceCount;
        int occupiedSeatingPlaceCount = 60;
        int occupiedStandingPlaceCount = 44;
        if (occupiedSeatingPlaceCount < seatingPlaceCount) {
            System.out.println("В вагоне есть " + (seatingPlaceCount - occupiedStandingPlaceCount) + " сидячих мест");
        }
        if (occupiedSeatingPlaceCount == seatingPlaceCount) {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (occupiedStandingPlaceCount <= standingPlaceCount) {
            System.out.println("В вагоне есть " + (standingPlaceCount - occupiedStandingPlaceCount) + " стоячих мест");
        }
        if ((occupiedSeatingPlaceCount + occupiedStandingPlaceCount) >= wagonCapacity) {
            System.out.println("Вагон полностью забит");
        }

        //homework 2
        System.out.println("Homework 2");

        //task 1
        System.out.println("Task 1");
        int newAge = 9;
        if (newAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //task 2
        System.out.println("Task 2");
        int newPersonAge = 20;
        if (newPersonAge >= 7 && newPersonAge < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (newPersonAge >= 18 && newPersonAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (newPersonAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //task 3
        System.out.println("Task 3");
        int newWagonCapacity = 102;
        int newSeatPlaceCount = 60;
        int newStandingPlaceCount = newWagonCapacity - newSeatPlaceCount;
        int newOccupiedSeatPlaceCount = 65;
        int newOccupiedStandingPlaceCount = 42;
        if (newOccupiedSeatPlaceCount < newSeatPlaceCount) {
            System.out.println("В вагоне есть " + (newSeatPlaceCount - newOccupiedSeatPlaceCount) + " сидячих мест");
        } else {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (newOccupiedStandingPlaceCount < newStandingPlaceCount) {
            System.out.println("В вагоне есть " + (newStandingPlaceCount - newOccupiedStandingPlaceCount) + " стоячих мест");
        } else {
            System.out.println("Вагон полностью забит");
        }

        //homework 3
        System.out.println("Homework 3");

        //task 1
        System.out.println("Task 1");
        int countAge = 9;
        boolean goToKindergarten = countAge >= 2 && countAge <= 6;
        boolean goToSchool = countAge >= 7 && countAge <= 18;
        boolean goToUniversity = countAge > 18 && countAge <= 24;
        boolean goToWork = countAge > 24;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + countAge + ", то ему нужно ходить в детский сад");
        } else if (goToSchool) {
            System.out.println("Если возраст человека равен " + countAge + ", то ему нужно ходить в школу");
        } else if (goToUniversity) {
            System.out.println("Если возраст человека равен " + countAge + ", то ему нужно ходить в университет");
        } else if (goToWork) {
            System.out.println("Если возраст человека равен " + countAge + ", то ему нужно ходить на работу");
        }

        //task 2
        System.out.println("Task 2");
        int childAge = 8;
        boolean cantRideTheAttraction = childAge < 5;
        boolean canRideOnlyAccompaniedByAnAdult = childAge >= 5 && childAge < 14;
        boolean canRideWithoutAnAdult = childAge >= 14;
        if (cantRideTheAttraction) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        } else if (canRideOnlyAccompaniedByAnAdult) {
            System.out.println("Ребёнок может кататься только в сопровождении взрослого");
        } else if (canRideWithoutAnAdult) {
            System.out.println("Ребёнок может кататься без сопровождения взрослого");
        }

        //task 3
        System.out.println("Task 3");
        int one = 41;
        int two = 25;
        int three = 72;
        if (one > two) {
            if (one >= three) {
                System.out.println("БОльшее чило " + one);
            } else {
                System.out.println("БОльшее чило " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("БОльшее чило " + two);
            } else {
                System.out.println("БОльшее чило " + three);
            }
        } else {
            if (one > three) {
                System.out.println("БОльшее чило " + one);
            } else if (three > one) {
                System.out.println("БОльшее чило " + three);
            } else {
                System.out.println("Все три числа равны");
            }
        }
    }
}