package main;

/**
 *
 * @author FernandoSanfielReyes
 */
public class Main {

    public static void main(String[] args) {
        long init = System.nanoTime();
        Histogram histogram = new MapHistogram();
        for (int i = 0; i < 1_000_000_000; i++) {
            histogram.put("Juan", 1);
        }
        System.out.println((System.nanoTime() - init)/1.e9);
    }

}
