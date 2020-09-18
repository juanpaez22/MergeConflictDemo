import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(124323));
        System.out.println(isPrime(3247));
        System.out.println(isPrime(54));
        System.out.println(isPrime(42));
        System.out.println(isPrime(11));
    }

    public static void isPrime(int x) {
        if (i < 2) return false;
        for (int i = 2; i < Math.sqrt(x; i ++) {
            if (x % i == 0) return false;
        }
    }
}

