import java.util.Scanner;
public class Saturdaymay3 {
    public static void oddNumbers(int a) {
        for (int i=1;i<=a;i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }

    public static void ymd(int a){
        int year = a/365;
        int month = (a%365)/30;
        int day = (a%365)%30;
        System.out.println("The entered number of days is equal to " + year + " years, " + month + " months, and " + day + " days.");
    }

    public static void word(String a) {
        String[] words = a.split(" ");
        int count = words.length;
                System.out.println("The total number of words is " + count + ".");
    }

    public static void harshad(int a) {
        int sum = 0, n = a;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        if (a % sum == 0) {
            System.out.println(a + " is a Harshad number.");
        } else {
            System.out.println(a + " is not a Harshad number.");
        }
    }

    public static void compound(double principal, double rate, int time, int n) {
        double cinterest = principal * Math.pow((1 + (rate / 100) / n), n * time);
        System.out.print("Compound Interest: "+cinterest);
    }

    public static void pprime(int a) {
        int original = a, reversed = 0;
        while (a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a /= 10;
        }
        if (original == reversed) {
            if (original > 1) {
                int count = 0;
                for (int i = 2; i <= Math.sqrt(original); i++) {
                    if (original % i == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(original + " is a palindrome prime.");
                } else {
                    System.out.println(original + " is not palindrome prime.");
                }
            }
        }
    }

    public static void swap(int a, int b) {
        System.out.println("The entered numbers are: "+a+" "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("The numbers are swapped as: "+a+" "+b);
    }

    public static void swapwno(int a, int b) {
        System.out.println("The entered numbers are: "+a+" "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("The numbers are swapped as: "+a+" "+b);
    }

    public static void natural(int a) {
        int sum = 0;
        for (int i=0;i<=a;i++) {
            sum = sum + i;
        }
        System.out.println("The sum of given natural numbers is: " + sum);
    }

    public static void factor(int a){
        for(int i=1;i<=a;i++){
         if (a%i==0){
             System.out.println(i+" is a factor");
         }
         }
     }
    
    public static void cube(int a){
        System.out.println("Cube="+a*a*a);      
      }

    public static void duck(int a){
        int num=a;
        int b;
        int c=0;
        int count=0;
        while(a!=0){
            b=a%10;
            c=c+b;
            a=a/10;
            if(b==0){
                count=count+1;
            }
        }
        if(count>=1){
            System.out.println(num+" is duck number");
        }
        else{
            System.out.println(num+" isnt duck number");
        }
    }

    public static void table(int a){
       for(int i=1;i<=10;i++){
        System.out.println(a+" X "+i+" = "+a*i);
       }
    }

    public static int SQ(int a){
        int sum=0;
        int b;
        int c=0;
        while(a!=0){
            b=a%10;
            c=c+b;
            a=a/10;
            sum=sum+b*b;
        }
        System.out.print("Sum="+sum);
        return a;
    }

    public static void UcLc(String a){
        int b=a.length();
        int U=0;
        int L=0;
        for(int i=0;i<b;i++){
            Character c=a.charAt(i);
            if (Character.isUpperCase(c)==true){
                U=U+1;
            }
            else if(Character.isLowerCase(c)){
                L=L+1;
            }
        }
        System.out.println("Uppercase="+U+"\nLowercase="+L);
    }

    public static void Kaprekar(int a){
        int sq=a*a;
        int count=0;
        int temp=sq;
        int c=0;
        while (temp!=0) {
            temp=temp/10;
            count++;
        }
        int div=1;
        for (int i=1;i<=count;i++) {
            div*=10;
            int right=sq%div;
            int left=sq/div;
            if (right>0&&left+right==a) {
                c++;
            }
        }
        if (c>=1){
            System.out.print(a+" is kaprekar number.");
        }
        else{
            System.out.print(a+" isnt kaprekar number.");
        }
    }

    public static void NumRev(int a){
        int b;
        int c=0;
        while(a!=0){
            b=a%10;
            c=c*10+b;
            a=a/10;
        }
        System.out.println("Reverse="+c);
    }

    public static void fibo(int a){
        int b = 0, c = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(b + " ");
            int d = b + c;
            b = c;
            c = d;
        }
    }
    
    public static void ASCII(char a){
        System.out.println("ASCII value="+(int) a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter any number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter any number: ");
        // int b = sc.nextInt();
        // System.out.print("Enter any string: ");
        // String a = sc.nextLine();
        // System.out.println("Enter the principle amount: ");
        // double principal = sc.nextDouble();
        // System.out.println("Enter the interest rate: ");
        // double rate = sc.nextDouble();
        // System.out.println("Enter the time: ");
        // int time = sc.nextInt();
        // System.out.print("Enter number of times interest is compounded per year: ");
        // int n = sc.nextInt();
        // System.out.print("Enter:");
        // int a=sc.nextInt();
        // System.out.print("Enter string:");
        // String a=sc.nextLine();
        // char b=a.charAt(0);
        

        // oddNumbers(a);
        // ymd(a);
        // harshad(a);
        // word(a);
        // compound(principal,rate,time,n);
        // pprime(a);
        // swap(a,b);
        // swapwno(a,b);
        // natural(a);
        // factor(a);
        // cube(a);
        // duck(a);
        // table(a);
        // SQ(a);
        // UcLc(a);
        // Kaprekar(a);
        // NumRev(a);
        // fibo(a);
        // ASCII(b);


        sc.close();
    }
}
