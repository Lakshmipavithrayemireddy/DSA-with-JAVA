class Main {
    public static void main(String[] args) {
        
        int numbers[]={10,3,56,67,100,67,37,99,35};
        System.out.println("Odd numbers are: ");
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2!=0 || numbers[i]%3==0)
            {
                System.out.println(numbers[i]);
                
            }
        }
    }
}

output:

Odd numbers are: 
3
67
67
37
99
35
