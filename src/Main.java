public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4};

        int max = new SalesManager(array).max();
        int mean = new SalesManager(array).mean();
        System.out.println(max);
        System.out.println(mean);

    }
}
