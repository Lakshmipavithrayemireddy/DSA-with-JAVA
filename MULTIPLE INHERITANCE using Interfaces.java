interface Owner{
    String ownerName="Animuthyam";
    int ownerPhone=15657;
}
interface ChaipodiSupplier{
    String supplierName="Rambabu";
    int supplierPhone=56780909;
    void display();
}
class ChaiShop implements Owner, ChaipodiSupplier{ 
    String branchName;
    int cupsSold;
    int priceperCup;
    @Override
    public void display(){
        System.out.println("Overiding the display method in ChaipodiSupplier interface to Chaishop");
    }
}
class Main {
    public static void main(String[] args) {
        ChaiShop branch1=new ChaiShop(); //object creation
        System.out.println("Owner Name= "+branch1.ownerName);
        System.out.println("SupplierName= "+branch1.supplierName);
        branch1.display();
    }
}
