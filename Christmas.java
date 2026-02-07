import java.util.Scanner;
class Christmas{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in)  ;
      int day=sc.nextInt();
      if(day==25){
          System.out.println("CHRISTMAS");
          
      }
      else{
          System.out.println("ORDINARY");
      }
      sc.close();
    }
}