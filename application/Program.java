package arrays.ex01.application;

import arrays.ex01.entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] vect = new Rent[10];

        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println();
            System.out.printf("Rent #%d:%n", (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            Integer room = sc.nextInt();

            vect[room] = new Rent(name, email, room);
        }
        System.out.println("Busy rooms:");
        for (int i=0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.printf("%d: %s, %s%n", vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
            }
        }

        sc.close();
    }
}
