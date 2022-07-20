public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }


    public long mean(){
        long sum = 0;
        int count = 0;
        for (long sale: sales){
            if (sale != min() && sale != max()){
                sum += sale;
                count++;
            }
        }

        return sum / count;
    }
}
