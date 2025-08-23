import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n = ");
        int n=sc.nextInt();
        int j;
        for(int i=0;i< n;i++)
        {
            for(j=n-i;j<n;j++)
            {
                  System.out.print("*");
            }
            System.out.println();
        }
    }
}


n = 7

*
**
***
****
*****
******
