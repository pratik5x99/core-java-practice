package oop.practice.exceptions.level1_terminal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Risk Multiplier");


        try(Scanner sc = new Scanner(System.in);){
            int num = sc.nextInt();
            int newPortfolio = 10000/num;
        }
        catch(InputMismatchException e){
            System.err.println("Error: Please enter a valid whole number");
        }
        catch (ArithmeticException e){
            System.err.println("Error: Cannot divide by zero.");
        }
        catch (Exception e){
            System.err.println("Something went wrong...");
        }
        int num1 = 23;
        System.out.println(num1);
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        System.out.println(num2);


    }
}
