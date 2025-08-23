class Main {
    public static void main(String[] args) {
        String greet="RADAR";
        int n=greet.length();
        boolean palindrome=false;
        System.out.println(greet);
        for(int i=0;i<n/2;i++)
        {
            if(greet.charAt(i)==greet.charAt(n-i-1))
            {
                palindrome=true;
            }
        }
        if(palindrome)
        {
            System.out.println("Yes, "+ greet + " is a palindrome!");
        }
        else
        {
            System.out.println("No,"+greet+ " is not a palindrome!");
        }
        
    }
}

