class Parent{
    final String Name="Animuthyam";
    final int Age=30; // final keyword makes the variable as constant
    void display(){
        System.out.println("static parent method");
    }
}
class Main {
    public static void main(String[] args) {
        Parent p1=new Parent(); 
        // p1.Age=45;
        // p1.Name="hhhhhhhh";
        System.out.println("parent age= "+p1.Age);
        System.out.println("parent name= "+p1.Name);
    
    }
}
