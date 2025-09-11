class ChaiShop 
{ 
    String branchName = "ChaiWaala";
    int cupsSold=90;
    int priceperCup=7;
    class Room
    {
        int roomNo=67;
        int noofChairs=56;
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        ChaiShop branch1=new ChaiShop(); //object creation
        System.out.println(branch1.branchName);
        ChaiShop.Room r1=branch1.new Room();
        System.out.println(r1.roomNo);
    
    }
}
