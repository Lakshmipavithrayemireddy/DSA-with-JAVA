class Main {
    public static void main(String[] args) {
        String greet="Hello DSA-with-JAVA";
        String reverse_of_greet="";
        System.out.println(greet);
        System.out.print("Reverse of greet: ");
        for(int i=greet.length()-1;i>=0;i--)
        {
            reverse_of_greet+=greet.charAt(i);
        }
        System.out.println(reverse_of_greet);
        if(greet.equals(reverse_of_greet))
        {
            System.out.println("Yes it's a Palindrome");
        }
        else
        {
            System.out.println("No it's not a Palindrome");
        }
    }
}

output:

Hello DSA-with-JAVA
Reverse of greet: AVAJ-htiw-ASD olleH
No it's not a Palindrome
