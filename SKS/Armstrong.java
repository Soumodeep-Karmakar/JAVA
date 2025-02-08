public class Armstrong {
    public static void main(String[] args) {
        int digit;
       
        for ( int i = 200; i <= 1000; i++) {
             int num=i;
            int sum=0; 
            while (num > 0) {
                digit = num % 10;
                sum+=Math.pow( digit,3);
                num = num/10;
            }
           // System.out.println(sum);
            if (sum==i) {
                System.out.println(i);
            }
        }
}
}