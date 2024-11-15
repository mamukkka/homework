package org.example;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("რომელი ქალაქია საქართველოს დედაქალაქი ?");
        String correctAnswer = "თბილისი";
        String answer = scanner.nextLine();

        while (!answer.equals(correctAnswer)){
            System.out.println("პასუხის არასწორია, კიდევ სცადეთ..");
            answer = scanner.nextLine();
        }

        System.out.println("პასუხი სწორია, გილოცავთ თქვენ გეოგრაფიის გურუ ხართ.");

        }

        }
