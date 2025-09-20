// JAVA program for "BEST TIME TO BUY AND SELL THE STOCK"
class Main {
    public static void main(String[] args)
    {
        int prices[]={7,1,5,3,6,4};
        int profit=0;
        for(int i=0;i<prices.length-1;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                // System.out.println(prices[i]+" "+prices[j]);  
                int temp=prices[j]-prices[i];
                if(temp>profit)
                {
                    profit=temp;   // Or profit=Math.max(profit,temp);
                }
            }
        }
        System.out.println("profit= "+profit);
    }
}
