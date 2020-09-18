package r2.src;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(50));
        System.out.println(isPrime(123));
        System.out.println(isPrime(37));
    }

    public static void isPrime(int x) {
        for (int y = 2; y < x; y ++) {
            if (y % i == 0) {
                return false;
            }
        }
        return true;
    }
}

