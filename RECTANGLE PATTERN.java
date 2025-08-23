import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("rows = ");
        int rows=sc.nextInt();
        System.out.print("Columns = ");
        int Columns=sc.nextInt();
        for(int i=0;i<=rows;i++)
        {
            for(int j=0;j<=Columns;j++)
            {
                System.out.print("*");
                if(j!=Columns)
                {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}

output:

rows = 5
Columns = 15
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
