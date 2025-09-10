class Owner{    //MULTILEVEL INHERITANCE
 String owner="NILOUFER";
 int phoneno=87777777;
}
class ChaiShop extends Owner
{
    String branchname= "CAFE NILOUFER";
    int chaiSold=50;
}
class Room extends ChaiShop{
    int roomNo =9;
    int noOfChairs=78;
    boolean isAcRoom=true;
}
class Main {
    public static void main(String[] args) {
       Room r1=new Room();
       System.out.println(r1.roomNo);
       System.out.println(r1.branchname);
       System.out.println(r1.chaiSold);
       System.out.println(r1.owner);
       System.out.println(r1.phoneno);
    }
}
