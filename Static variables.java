class Owner{
    static String ownerName="Animuthyam";
    static int ownerPhone=7738785;
    int a=10;
}
class Person{
    String name="charan";
    int age=15;
    int b=10;
}
class Main {
    public static void main(String[] args) {
        System.out.println(Owner.ownerName);
        System.out.println(Owner.ownerPhone);
        Owner o1=new Owner();
        Owner o2=new Owner();
        o1.a++; // stored in static not in object
        o2.a++; // stored in static not in object
        System.out.println(o1.a);
        Child cc=new Child();
        Child sd=new Child();
        cc.b++; // stored in object
        System.out.println(cc.b);
        sd.b++; //stored in object
        System.out.println(sd.b);
    }
}
