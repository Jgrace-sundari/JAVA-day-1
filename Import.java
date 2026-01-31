import java.util.Scanner;
class Import{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String space=" ";
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("You are"+space+age+space+"years old.");
        sc.close();
    }
}