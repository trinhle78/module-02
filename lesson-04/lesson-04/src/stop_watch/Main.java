package stop_watch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        Fibonacci(45);
        stopwatch.stop();
        System.out.println("Elapsed time in milliseconds: "
                + stopwatch.getElapsedMilliseconds());
    }
    private static int Fibonacci(int n) {
        if (n < 2)
            return 1;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
