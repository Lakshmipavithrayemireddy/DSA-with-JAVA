class Main {
    public static void main(String[] args) {
        
        int numbers[]={10,3,56,67,100,67,37,99,35};
        System.out.println("Even numbers are: ");
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2==0 && numbers[i]%1==0)
            {
                System.out.println(numbers[i]);
                
            }
        }
    }
}

output:

Even numbers are: 
10
56
100
