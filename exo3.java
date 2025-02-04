public class exo3 {

    public static void main(String[] args) {
        int[] data = { 3, 5, 7, 2, 8, 10, 11, 1, 6, 4 };
        double sum = 0;
        for (int value : data) {
            sum += value;
        }
        double mean = sum / data.length;
        System.out.println("moyenne" + mean);
    }
}
