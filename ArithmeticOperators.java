import java.util.Scanner;
public class ArithmeticOperators{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition Operation: "+(a+b));
        System.out.println("Subtraction Operation: "+(a-b));
        System.out.println("Multiplication Operation: "+(a*b));
        System.out.println("Integer Division Operation: "+(a/b));
        System.out.println("Modulo Operation: "+(a%b));
        sc.close();
        
    }
}