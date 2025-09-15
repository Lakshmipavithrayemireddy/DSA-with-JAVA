class Parent
{
    final void display()
    {
        System.out.println("final method");
    }
}
class Child extends Parent
{   
    void display()
    {
        System.out.println("overiding final method");
    }
    
}
class Main
{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.display();
    
    }
}
