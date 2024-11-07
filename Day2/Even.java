import java.util.Scanner;
class Even{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("Enter the value of a n:");
    n=sc.nextInt();
    if(n%2==0){
     System.out.println("Even number");
    }
    else{
      System.out.println("odd number");
    }
  }
}