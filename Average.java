import java.util.Scanner;
class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int overall_total=0;
        System.out.println("Enter number of subjects");
        int num=sc.nextInt();
        System.out.println("Enter total marks for a subject");
        int total=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the marks of each subject");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            overall_total+=arr[i];
        }
        float average=(float)overall_total/num;
        System.out.println("Total marks="+overall_total);
        System.out.println("Average="+average);   
        sc.close();     
    }
}