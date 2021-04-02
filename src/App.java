import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Chapter2 { //public is not required because it is in the same file
    public void milestone1(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    public void milestone2(double num2_2) {
        System.out.println((int)num2_2);

        System.out.println((int)((num2_2 - (int)num2_2) * 100));
    }

    public void milestone3() {
        System.out.println("Prime Numbers:");
        for(int i = 2; i< 100; i++){

            boolean notPrime = false;

            for (int j = 2; j <= i/2; j++){

                if(i%j==0){
                    notPrime = true;
                    break;
                }
            }

            if(!notPrime){
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public void milestone4(int seconds) {

        int numberOfDays;
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        numberOfDays = seconds / 86400;
        System.out.println("Days:" + numberOfDays);

        numberOfHours = (seconds % 86400) / 3600;
        System.out.println("Hours:" + numberOfHours);

        numberOfMinutes = ((seconds % 86400) % 3600) / 60;
        System.out.println("Minutes:" + numberOfMinutes);

        numberOfSeconds = ((seconds % 86400) % 3600) % 60;
        System.out.println("Seconds:" + numberOfSeconds);
    }

}

public class App {
    static void chapter1milestone1(double num1, double num2) {
        System.out.print("Largest is: ");
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
    
    static void chapter1milestone2(double num1_2a, double num1_2b) {
        System.out.println("The average is: " + String.format("%.2f", ((num1_2a + num1_2b) / 2 )));
    }

    // Declare the Chapter 1 Milestone 3 method here
    static void chapter1milestone3(double radius) {
        System.out.println("The circumference is: " + String.format("%.2f", (2 * 3.14 * radius)));
        System.out.println("The area is: " + String.format("%.2f", (3.14 * radius * radius)));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** CHAPTER 1 MILESTONE 1 **");
        System.out.println("Please enter two numbers:");
        double num1_1a = scanner.nextDouble();
        double num1_1b = scanner.nextDouble();
        // Chapter 1 Milestone 1 method here
        chapter1milestone1(num1_1a, num1_1b);

        System.out.println("\n** CHAPTER 1 MILESTONE 2 **");
        System.out.println("Please enter two numbers:");
        double num1_2a = scanner.nextDouble();
        double num1_2b = scanner.nextDouble();
        //Chapter 1 Milestone 2 method here
        chapter1milestone2(num1_2a, num1_2b);

        System.out.println("\n** CHAPTER 1 MILESTONE 3 **");
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        //Chapter 1 Milestone 3 method here
        chapter1milestone3(radius);

        System.out.println("\n** CHAPTER 2 MILESTONE 1 **");
        System.out.println("Enter a Number:");
        int num2_1 = scanner.nextInt();
        //Chapter 2 Milestone 1 method here
        Chapter2 chapter2 = new Chapter2(); //don't need to declare again??
        chapter2.milestone1(num2_1); //objectname.methodname(passing argments)

        System.out.println("\n** CHAPTER 2 MILESTONE 2 **");
        System.out.println("Please input a decimal number:");
        double num2_2 = scanner.nextDouble();
        //Chapter 2 Milestone 2 method here
        chapter2.milestone2(num2_2);

        System.out.println("\n** CHAPTER 2 MILESTONE 3 **");
        //Chapter 2 Milestone 3 method here
        chapter2.milestone3();


        System.out.println("\n** CHAPTER 2 MILESTONE 4 **");
        System.out.println("Enter a number for seconds:");
        int seconds = scanner.nextInt();
        //Chapter 2 Milestone 4 method here
        chapter2.milestone4(seconds);

        System.out.println("\n** CHAPTER 3 MILESTONE 1 **");
        System.out.println("Enter two numbers:");
        int num3_1a = scanner.nextInt();
        int num3_1b = scanner.nextInt();
        // Call the Chapter 3 Milestone 1 method here
        Chapter3 chapter3 = new Chapter3();
        chapter3.milestone1(num3_1a, num3_1b);

        System.out.println("\n** CHAPTER 3 MILESTONE 2 **");
        // Call the Chapter 3 Milestone 2 method here
        //call a method, don't pass any information into it. Stick all of code into method
        chapter3.milestone2(scanner);


        System.out.println("\n** CHAPTER 3 MILESTONE 3 **");
        int min = 1;
        int max = 12;
        int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randNum1);
        System.out.println(randNum2);
        System.out.println("What is the product of these two numbers?");
        int num3_3 = scanner.nextInt();
        // Call the Chapter 3 Milestone 3 method here
        chapter3.milestone3(randNum1, randNum2, num3_3);

        scanner.close();
    }
}
