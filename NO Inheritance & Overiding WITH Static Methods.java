class Parent{
    String Name="Animuthyam";
    int Age=35;
    static void display(){
        System.out.println("static parent method");
    }
    void display2(){
        System.out.println("non static parent method");
    }
}
class Child extends Parent{
        String Name="charan";
        int Age=15;
        static void display(){
            System.out.println("static child method");
        }
        @Override
        void display2(){
            System.out.println("non static child method");
        }
}
class Main {
    public static void main(String[] args) {
        Parent pc=new Child(); 
        System.out.println("pc name= "+pc.Name);//left-> variables, static methods
        System.out.println("pc age= "+pc.Age);  //right-> methods
        System.out.print("pc display= ");
        pc.display();// its static method so its print parent related method
        pc.display2(); //its non static method, so its overriden by child method
    }
}
