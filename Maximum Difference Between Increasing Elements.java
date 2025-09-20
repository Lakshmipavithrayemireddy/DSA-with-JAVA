// Maximum Difference Between Increasing Elements
class Main {
    public static void main(String[] args)
    {
        int arr[]={7,1,5,3,6,4};
        int max_difference=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int a=arr[i];
                int b=arr[j];
                if(b>a)
                {
                    int temp=b-a;
                    max_difference=Math.max(temp,max_difference);
                }
            }
        }
        System.out.println("Max difference b/w Increasing Elements: "+max_difference);
    }
}
