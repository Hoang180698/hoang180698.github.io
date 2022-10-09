public class _50_Pow {
    public static double myPow(double x, int n) {
        double k;
            if (n == 0) {
                return 1;
            }
            
        k = myPow(x, n / 2);
 
        if (n % 2 == 0)
            return k * k;
        else {
            if (n > 0)
                return x * k * k;
            else
                return (k * k) / x;
        }
        
        // if (n == 0) {
        //     return 1;
        // } else if (n > 0) {
        //     return x * myPow(x, n - 1);
        // }
        // return (1 / x) * myPow(x, n + 1);

    }

    public static void main(String[] args) {

        System.out.println(myPow(2, -2));

    }
}
