public class Main {
    public static void main(String[] args) {

        long[] array = new long[]{1, 2, 3, 4};

        long max = new SalesManager(array).max();
        long mean = new SalesManager(array).mean();
        System.out.println(max);
        System.out.println(mean);

    }
}
