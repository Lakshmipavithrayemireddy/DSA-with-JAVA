class ChaiShop
{
    
    static int cupsSold=0;
    int priceperCup=0;
    
}
class Main {
    public static void main(String[] args) 
    {
        ChaiShop a=new ChaiShop();
        ChaiShop b=new ChaiShop();
        a.cupsSold++; // As it is static it is directly stores at ChaiShop instead of object a  so, cupssold=1
        a.priceperCup++;
        b.cupsSold++;  // As it is static it is directly stores at ChaiShop instead of object b so, cupssold=1+1=2
        b.priceperCup++;
        System.out.println(a.cupsSold+" "+a.priceperCup);
        System.out.println(b.cupsSold+" "+b.priceperCup);
        
       
    }
}
