package Q3_ChatwithGPT;

import java.util.Scanner;

public class P12_primeNumberMethod {
    public static void main(String[] args) {
        /*
        I asked to ChatGPT:
        ask me 5 while loop, 5 do while loop, 10 method overloading, 10 for loop question,
        5 basic array question in Java language,
        and ask this questions in a mix, also these will be different from previous questions
        It said quickly:
        Certainly! Here are some mixed Java questions:
         */

        // Q12: Write a method that takes in an integer and returns true if it is a prime number, and false otherwise.
        Scanner scan = new Scanner(System.in);
        System.out.println("This program control the number you given and return true if it is a prime number, and false otherwise" +
                "\nPlease enter a positive number : ");
        int num = scan.nextInt();


        if (!isPrime(num)){
            System.out.println();
            System.out.println("========== RESULT ==========");
            System.out.println(isPrime(num) + ", " + num + " is not a prime number.");
        } else {
            System.out.println();
            System.out.println("========== RESULT ==========");
            System.out.println(isPrime(num) + ", " + num + " is a prime number.");
        }

    }
    public static boolean isPrime(int x){
        boolean flag = false;
        boolean tf = true;

        if (x < 2) {
            return !tf;
        } else if (x >= 2) {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return tf;
            } else {
                return !tf;
            }
        }
        return flag;
    }
}
