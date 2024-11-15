package org.example;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // სკანერის ობიექტის შექმნა, მომხმარებლის პასუხის გასაგებად
        System.out.println("რომელი ქალაქია საქართველოს დედაქალაქი ?"); // მომხმარებლისთვის დასასმელი კითხვა
        String correctAnswer = "თბილისი"; // სწორი პასუხი
        String answer = scanner.nextLine(); // მომხმარებლის პასუხი

        while (!answer.equals(correctAnswer)){ // ციკლი, რომელიც ამეორებს კითხვას თუ პასუხი არასწორია
            System.out.println("პასუხი არასწორია, კიდევ სცადეთ..");
            answer = scanner.nextLine();
        }

        System.out.println("პასუხი სწორია, გილოცავთ თქვენ გეოგრაფიის გურუ ხართ."); // შეტყობინება თუ მომხმარებელმა სწორად უპასუხა

    }

}