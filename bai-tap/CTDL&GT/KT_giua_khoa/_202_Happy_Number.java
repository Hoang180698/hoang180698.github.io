
public class _202_Happy_Number {
    public boolean isHappy(int n) {
        while (n > 9) {
            n = total(n);
        }
        if (n == 1 || n == 7) {
            return true;
        }
        return false;
    }

    public int total(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
