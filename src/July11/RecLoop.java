public class RecLoop {

    public int calc(int n) {
        if (n == 0) return 0;      // base case
        return n + calc(n - 1);    // recursive step toward base case
    }

    public static void main(String[] args) {
        RecLoop rl = new RecLoop();
        int result = rl.calc(5);   // For example: 5 + 4 + 3 + 2 + 1 + 0 = 15
        System.out.println("Result: " + result);
    }
}
