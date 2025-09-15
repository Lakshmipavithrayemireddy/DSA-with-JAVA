class Parent{
    static String parentName="Animuthyam";
    static int parentPhone=7738785;
    static class Child
    {
        String childName="charan";
        int childAge=15;
        static void display()
        {
            System.out.println("Acessing static methods from static inner-class");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Parent.Child.display();
        
    }
}
