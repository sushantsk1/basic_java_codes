public class reverseNumber {
    public static void main(String[] args) {
        int num=1234;

        int lastDigit;
        int reverse=0;

        while(num>0){
            lastDigit=num%10;
            reverse=reverse*10+lastDigit;
            num/=10;
        }
        System.out.println(reverse);
    }
    
}
