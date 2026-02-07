import java.util.Scanner;
class Data_Types{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tEnter student details ");
        System.out.println("Enter student name:");
        
        String name=sc.nextLine();
        // sc.nextLine();
        System.out.print("Enter student age:\n");
        short age=sc.nextShort();
        sc.nextLine();
        System.out.print("Enter student grade:\n");
        char grade=sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter student total_marks(out of 100):\n");
        byte marks=sc.nextByte();
        sc.nextLine();
        System.out.print("Enter student status(fail/pass):\n");
        String status=sc.next();
        System.out.println("\t\t\tOverall Student Record");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
        System.out.println("Grade:"+grade);
        System.out.println("Status:"+status);
        sc.close();

    }
}