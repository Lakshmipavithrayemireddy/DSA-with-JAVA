//PROGRAM TO PRINT THE TABLE
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the table to print: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        
    }
}
