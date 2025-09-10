class Shops{
 String owner="java";
    void fun(int a){
        System.out.println(6);
    }
}
class ChaiShop extends Shops{
    String branchname;
    int chaiSold;
    int pricePerChai;
    public ChaiShop(String bn,int cs,int ppc) {
        this.branchname=bn;
        this.chaiSold=cs;
        this.pricePerChai=ppc;
        System.out.println(branchname +" "+chaiSold+" "+pricePerChai);
        System.out.println("Revenue got= "+(chaiSold*pricePerChai));
    }
    @Override
    void fun(int a){
        System.out.println(7);
    }
}
class Main {
    public static void main(String[] args) {
       ChaiShop branch1=new ChaiShop("cafe-Niloufer",600,50);
       branch1.fun(9);  
    }
}
