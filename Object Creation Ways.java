class Parent{
    String Name="Animuthyam";
    int Age=35;
    void display(){
        System.out.println("parent method");
    }
}
class Child extends Parent{
        String Name="charan";
        int Age=15;
        void display(){
            System.out.println("child method");
        }
}
class Main {
    public static void main(String[] args) {
        Parent pp=new Parent(); //way1
        pp.display();
        Child cc=new Child(); 
        cc.display();
        Parent pc=new Child(); //way2
        System.out.println("pc name= "+pc.Name);//left-> variables, static methods
        System.out.println("pc age= "+pc.Age);  //right-> methods
        System.out.print("pc display= ");
        pc.display();
    }
}
