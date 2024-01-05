public class palindromeNumber {
    public static void main(String[] args) {
        int num=1234;
        int copy=num;
        int lastDigit;
        int reverse=0;

        while(num>0){
            lastDigit=num%10;
            reverse=reverse*10+lastDigit;
            num/=10;
        }
        if (copy==reverse) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a plindrome");
        }
    }
    
}
