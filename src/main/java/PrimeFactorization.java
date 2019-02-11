import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {

    ArrayList primeFactorList = new ArrayList();

    public int initFactor() {

        long number;
        Scanner sc = new Scanner(System.in);

        System.out.println("The prime factors of 13195 are 5, 7, 13 and 29.\n" +
                "What is the largest prime factor of the number 600851475143?\n");
        System.out.println("Please enter the to be factored number");

        number = sc.nextLong();
        Factor(number);
        System.out.println(primeFactorList);

        return 1;
    }

    public void Factor(long number) {

        for (long factor = 2; factor < 10000; factor++) {
            if (number % factor == 0 && isPrime(factor)) {
                long factorR = number / factor;
                primeFactorList.add(factor);
//                System.out.println(primeFactorList);
                Factor(factorR);
                return;
            }
            if (number % factor == 0 && !isPrime(factor)) {
                Factor(factor);
                return;
            }
        }
        return;
    }

    //checks whether an int is prime or not.
    boolean isPrime(long n) {
        for(long i = 2; i < n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

}
