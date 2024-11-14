package org.example;

public class Main {
    public static void main(String[] args) {

        int finalScore = 85;

        switch (finalScore){
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 :
                System.out.println("A");
                break;

            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 :
                System.out.println("B");
                break;


            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 :
                System.out.println("C");
                break;

            default:
                System.out.println("არ გეკუთნის სერტიფიკატი");
                break;

        }


    }
}