class Fibonacci {
    // Recursive
    public int CalculateFibonacci(int n) {
        if (n < 2)
            return n;
        return CalculateFibonacci(n - 1) + CalculateFibonacci(n - 2);
    }

    // Memoization
    public int CalculateFibonacciMemoizatiion(int n) {
        int memoize[] = new int[n + 1];
        return CalculateFibonacciMemoizatiion(memoize, n);
    }

    public int CalculateFibonacciMemoizatiion(int[] memoize, int n) {
        if (n < 2)
            return n;

        // if we have already solved this subproblem, simply return the result from the
        // cache
        if (memoize[n] != 0)
            return memoize[n];

        memoize[n] = CalculateFibonacciMemoizatiion(memoize, n - 1) + CalculateFibonacciMemoizatiion(memoize, n - 2);
        return memoize[n];
    }

    // DP
    public int CalculateFibonacciDP(int n) {
        if (n == 0)
            return 0;
        int dp[] = new int[n + 1];

        // base cases
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacci(5));
        System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacci(6));
        System.out.println("7th Fibonacci is ---> " + fib.CalculateFibonacci(7));

        System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacciMemoizatiion(5));
        System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacciMemoizatiion(6));
        System.out.println("7th Fibonacci is ---> " + fib.CalculateFibonacciMemoizatiion(7));

        System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacciDP(5));
        System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacciDP(6));
        System.out.println("7th Fibonacci is ---> " + fib.CalculateFibonacciDP(7));
    }
}