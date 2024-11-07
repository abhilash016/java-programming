import java.util.Scanner;
class Product{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int pno;
    String pname;
    float pcost;
    float pquantity;
    System.out.println("Enter the product no:");
    pno=sc.nextInt();
    System.out.println("Enter the product name:");
    pname=sc.next();
    System.out.println("Enter the product cost:");
    pcost=sc.nextFloat();
    System.out.println("Enter the product quantity:");
    pquantity=sc.nextFloat();
    System.out.println("The given product no is:" +pno);
    System.out.println("The given product name is:" +pname);
    System.out.println("The given product cost is:" +pcost);
    System.out.println("The given product quantity is:" +pquantity);
    float bill=pcost*pquantity;
    System.out.println("The total bill is:"+bill);
  }
}