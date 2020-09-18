import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
        System.out.println(isPrime(63));
        System.out.println(isPrime(1234675664231));
    }

    public static void isPrime(int x) {
        for (int j = 2; j < Math.sqrt(x); j ++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}

