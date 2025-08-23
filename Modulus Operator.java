class Main {
    public static void main(String[] args) {
        
        int lucky_draw[]={10,3,56,67,100,67,37,99,35};
        for(int i=0;i<lucky_draw.length;i++)
        {
            if(lucky_draw[i]%100==0)
            {
                System.out.println(lucky_draw[i]);
                System.out.println("Hey, You are the LUCKY_DRAW Winner");
            }
        }
    }
}

output:

100
Hey, You are the LUCKY_DRAW Winner
