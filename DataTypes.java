import java.util.Scanner;
class DataTypes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an int value:");
        int a=sc.nextInt();
        System.out.println("You entered="+a);
        System.out.println("Enter a float value:");
        float b=sc.nextFloat();
        System.out.println("You entered="+b);
        System.out.println("Enter a double value:");
        double c=sc.nextDouble();
        System.out.println("You entered="+c);
        sc.nextLine();
        
        System.out.println("Enter a string value:");
        String d=sc.next();
        
        System.out.println("You entered="+d);
        sc.nextLine();
        System.out.println("Enter a string value(many words):");
        String e=sc.nextLine();
        
        System.out.println("You entered="+e);
        sc.close();






    }
}