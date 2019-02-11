// Rex Fleur 18/05/2016

public class Main {

    public static void main(String[] args) {
        System.out.println("Each class represents one challenge.");

        FiveAndThree ex1 = new FiveAndThree();
        System.out.println("Exercise one: " + ex1.Solve());
        Fibonacci ex2 = new Fibonacci();
        System.out.println("Exercise two: " + ex2.sumOfEvens());
        PrimeFactorization ex3 = new PrimeFactorization();
        System.out.println("Exercise three: ");
        ex3.initFactor();

    }
}
