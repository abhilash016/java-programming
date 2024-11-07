import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("Enter the value of a n:");
    n=sc.nextInt();
    if(n>0){
      System.out.println("It is a positive number");
    }
    else if(n<0){
      System.out.println("it is a negative number");
    }
    else{
      System.out.println("neither +ve or -ve");
    }
  }
}