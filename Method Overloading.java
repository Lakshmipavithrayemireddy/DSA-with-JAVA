class Adding
{
    void fun(int a){
        System.out.println(a);
    }
    void fun(int a,int b){
        System.out.println(a+b);
    }
    void fun(int a,String b){
        System.out.println(a+b);
    }
    void fun(String a,int b) {
        System.out.println(a+b);
    }
    void fun(String a,String b){
        System.out.println(a+b);
    }
}
class Main {
    public static void main(String[] args) {
       Adding branch1=new Adding();
       branch1.fun(9);
       branch1.fun(9,8);
       branch1.fun(9,"Hello");
       branch1.fun("JAVA",8);
       branch1.fun("WITH","DSA");
    }
}
