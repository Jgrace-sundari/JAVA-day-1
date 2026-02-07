import java.util.Scanner;
class RelationalOperators{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        byte age=sc.nextByte();
        if(age>0){
            System.out.println("You'll be "+(age+10)+ " years old 10 years later!!");
        }
        else if(age==0){
            System.out.println("You are yet to be born!!");
        }
        else{
            System.out.println("Invalid age!!");
        }

    }
}