abstract class Owner{
    String ownerName="dsawithjava";
    int ownerAge=20;
}
class Child extends Owner{
    String childName="dsa";
    int childAge=10;
}
class Main {
    public static void main(String[] args) {
        Child c1=new Child();
        System.out.println("owner name= "+c1.ownerName);
        System.out.println("owner age= "+c1.ownerAge);
        System.out.println("child age= "+c1.childAge);
    
    }
}
