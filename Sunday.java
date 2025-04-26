//1. Write a Java program to input your full name and print a greeting message.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("What is your name?");
//         String name = sc.nextLine();

//         System.out.println("Hello"+" "+ name +"."+" "+" Welcome to Java.");
//         sc.close();
//     }    
// }

//2. Take two numbers as input and print their sum, difference, product, and quotient.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int first = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int second = sc.nextInt();

//         int sum = first + second;
//         int diff = first - second;
//         int prod = first * second;
//         double quo = first/second;

//         System.out.print("The sum of"+" "+first+" and "+second+" "+"is"+" "+sum+".");
//         System.out.print("The difference between "+" "+first+" and "+second+" "+"is"+" "+diff+".");
//         System.out.print("The product of"+" "+first+" and "+second+" "+"is"+" "+prod+".");
//         System.out.print("The quotient of"+" "+first+" and "+second+" "+"is"+" "+quo+".");
//          sc.close();
//     }
// }

//3. Write a program to check whether a given number is positive, negative, or zero using if-else.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter any number: ");
//         int userInput = sc.nextInt();

//         if (userInput>0){
//             System.out.println("The given number is positive.");
//         }
//         else if (userInput<0){
//             System.out.println("The given number is negative.");
//         }
//         else if (userInput==0){
//             System.out.println("The given number is zero.");
//         }
//         sc.close();
//     }
// }

//4. Write a program that takes a number and checks if it is divisible by both 5 and 11.
// import java.util.Scanner;
// public class Sunday{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter any number: ");
//         int userInput = sc.nextInt();

//         if (userInput%5==0 && userInput%11==0){
//             System.out.println("The given number is divisible by both 5 and 11.");
//         }
//         else {
//             System.out.println("The give number is not divisible by both 5 and 11.");
//         }
//     sc.close();
//     }
// }

//5. Input three numbers and print the largest using if-else.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter first number: ");
//         int first = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int second = sc.nextInt();
//         System.out.println("Enter third number: ");
//         int third = sc.nextInt();

//         if (first>=second && first>=third) {
//             System.out.println(first+" is greather than "+second+" and "+third+".");
//         }
//         else if (second>=first && second>=third) {
//             System.out.println(second+" is greather than "+first+" and "+third+".");
//         }
//         if (third>=second && third>=first) {
//             System.out.println(third+" is greather than "+second+" and "+first+".");
//         }
//         sc.close();
//     }
// }

// 6. Take a number from the user and print whether it is even or odd.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter any number: ");
//         int userInput = sc.nextInt();

//         if (userInput % 2 == 0) {
//             System.out.println("The given number is even.");
//         }
//         else {
//             System.out.prinln("The given number is odd.");
//         }
//         sc.close();
//     }
// }

//7. Input the age of a person and check if they are eligible to vote (18 or older).
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your age.");
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.println("You are eligible to vote.");
//         }
//         else {
//             System.out.print("You are not eligible to vote.");
//         }
//         sc.close();
//     }
// }

//8. Write a program to input a character and check if it is a vowel or a consonant using if-else.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter any character: ");
//         char ch = sc.next().charAt(0);

//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//             System.out.println(ch + " is a vowel.");
//        }
//        else {
//         System.out.println(ch + " is a consonant.");
//        }
//        sc.close();
//     }
// }


//9. Take marks of five subjects and calculate the total, percentage, and grade using if-else.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter marks of five subjects: ");
//         double marks1 = sc.nextDouble();
//         double marks2 = sc.nextDouble();
//         double marks3 = sc.nextDouble();
//         double marks4 = sc.nextDouble();
//         double marks5 = sc.nextDouble();

//         double total = marks1 + marks2 + marks3 + marks4 + marks5;
//         double percentage = (total / 500) * 100;
//         String grade;
//         if (percentage >= 90) {
//         grade = "A";
//         } else if (percentage >= 80) {
//             grade = "B";
//         } else if (percentage >= 70) {
//             grade = "C";
//         } else if (percentage >= 60) {
//             grade = "D";
//         } else {
//             grade = "F";
//         }
//             System.out.println("Total: " + total);
//             System.out.println("Percentage: " + percentage + "%");
//             System.out.println("Grade: " + grade);
//             sc.close();
//     }
// }

//10. Write a program to take a number from the user and print whether it is a leap year or not.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }

//         sc.close();
//     }
// }

//11. Input a number from the user and display whether it is a prime number using a  loop.
// import java.util.Scanner;
// public class Sunday{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         boolean isPrime = true;

//         if (number <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= Math.sqrt(number); i++) {
//                 if (number % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }

//         sc.close();
//     }
// }

//12. Write a program to print the multiplication table of a given number using loop.
// import java.util.Scanner;
// public class Sunday{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         System.out.println("Multiplication table of " + number + ":");
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(number + " x " + i + " = " + (number * i));
//         }

//         sc.close();
//     }
// }

//13. Take a number n and print the sum of first n natural numbers using a loop.
// import java.util.Scanner;
// public class Sunday{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int sum = 0;

//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }

//         System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
//         sc.close();
//     }
// }

//14. Write a program that prints all even numbers from 1 to 100 using  loop.
// public class Sunday {
//     public static void main(String[] args) {
//         System.out.println("Even numbers from 1 to 100:");
//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

//15. Input a number and display the factorial of that number using a  loop.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         long factorial = 1;

//         for (int i = 1; i <= number; i++) {
//             factorial *= i;
//         }

//         System.out.println("The factorial of " + number + " is: " + factorial);
//         sc.close();
//     }
// }

//16. Take two numbers and an operator (+, -, *, /) and perform the operation using switch.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();
//         System.out.print("Enter an operator (+, -, *, /): ");
//         char operator = sc.next().charAt(0);
//         double result;

//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 if (num2 != 0) {
//                     result = num1 / num2;
//                 } else {
//                     System.out.println("Error! Division by zero.");
//                     return;
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operator!");
//                 return;
//         }

//         System.out.println("Result: " + result);
//         sc.close();
//     }
// }

//17. Write a program to input a number from 1 to 7 and display the day of the week using switch.
// import java.util.Scanner;
// public class Sunday{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number (1-7): ");
//         int day = sc.nextInt();
//         String dayName;

//         switch (day) {
//             case 1:
//                 dayName = "Monday";
//                 break;
//             case 2:
//                 dayName = "Tuesday";
//                 break;
//             case 3:
//                 dayName = "Wednesday";
//                 break;
//             case 4:
//                 dayName = "Thursday";
//                 break;
//             case 5:
//                 dayName = "Friday";
//                 break;
//             case 6:
//                 dayName = "Saturday";
//                 break;
//             case 7:
//                 dayName = "Sunday";
//                 break;
//             default:
//                 System.out.println("Invalid input! Please enter a number between 1 and 7.");
//                 return;
//         }

//         System.out.println("The day is: " + dayName);
//         sc.close();
//     }
// }

// 18. Input a month number (1–12) and print the number of days in that month using switch.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a month number (1-12): ");
//         int month = sc.nextInt();
//         int days;

//         switch (month) {
//             case 1: // January
//             case 3: // March
//             case 5: // May
//             case 7: // July
//             case 8: // August
//             case 10: // October
//             case 12: // December
//                 days = 31;
//                 break;
//             case 4: // April
//             case 6: // June
//             case 9: // September
//             case 11: // November
//                 days = 30;
//                 break;
//             case 2: // February
//                 System.out.print("Enter the year: ");
//                 int year = sc.nextInt();
//                 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                     days = 29; // Leap year
//                 } else {
//                     days = 28; // Non-leap year
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid month number! Please enter a number between 1 and 12.");
//                 return;
//         }

//         System.out.println("Number of days in month " + month + ": " + days);
//         sc.close();
//     }
// }

// 19. Take a character input and use switch to display if it is a vowel (a, e, i, o, u).
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);

//         switch (ch) {
//             case 'a':
//             case 'e':
//             case 'i':
//             case 'o':
//             case 'u':
//             case 'A':
//             case 'E':
//             case 'I':
//             case 'O':
//             case 'U':
//                 System.out.println(ch + " is a vowel.");
//                 break;
//             default:
//                 System.out.println(ch + " is not a vowel.");
//         }

//         sc.close();
//     }
// }

// 20. Input a number and check if it is a perfect square using loop.
// import java.util.Scanner;
// public class Sunday{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         boolean isPerfectSquare = false;

//         for (int i = 0; i * i <= number; i++) {
//             if (i * i == number) {
//                 isPerfectSquare = true;
//                 break;
//             }
//         }

//         if (isPerfectSquare) {
//             System.out.println(number + " is a perfect square.");
//         } else {
//             System.out.println(number + " is not a perfect square.");
//         }

//         sc.close();
//     }
// }

// 21. Write a program to find the sum of digits of a number using a loop.
// import java.util.Scanner;
// public class Sunday{ 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         int reversedNumber = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             reversedNumber = reversedNumber * 10 + digit;
//             number /= 10;
//         }

//         System.out.println("Reversed number: " + reversedNumber);
//         sc.close();
//     }
// }

// 22.  Take a number and check whether it is a palindrome or not using if-else and loop.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         int originalNumber = number;
//         int reversedNumber = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             reversedNumber = reversedNumber * 10 + digit;
//             number /= 10;
//         }

//         if (originalNumber == reversedNumber) {
//             System.out.println(originalNumber + " is a palindrome.");
//         } else {
//             System.out.println(originalNumber + " is not a palindrome.");
//         }

//         sc.close();
//     }
// }

// 23. Input n and print the first n terms of the Fibonacci series.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = sc.nextInt();

//         int first = 0, second = 1;

//         System.out.println("Fibonacci Series up to " + n + " terms:");

//         for (int i = 1; i <= n; i++) {
//             System.out.print(first + " ");
//             int next = first + second;
//             first = second;
//             second = next;
//         }
//         sc.close();
//     }
// }

// 24. Write a program to count how many digits are in a given number using a loop.
// import java.util.Scanner;
// public class Sunday {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         int count = 0;

//         while (number != 0) {
//             number /= 10;
//             count++;
//         }

//         System.out.println("The number of digits is: " + count);
//         sc.close();
//     }
// } 