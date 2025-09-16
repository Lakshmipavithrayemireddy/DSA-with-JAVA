abstract class Owner{
    String ownerName="dsawithjava";
    int ownerAge=20;
    abstract void display();
    void display2(){
        System.out.println("normal method inside abstract class");
    }
}
class Child extends Owner{
    String childName="dsa";
    int childAge=10;
    @Override
    void display() {
        System.out.println("abstract method overriden by sub class");
    }
}
class Main {
    public static void main(String[] args) {
        Child c1=new Child();
        System.out.println("owner name= "+c1.ownerName);
        System.out.println("owner age= "+c1.ownerAge);
        System.out.println("child age= "+c1.childAge);
        c1.display();
        c1.display2();
    }
}
