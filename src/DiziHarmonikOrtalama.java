public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5};
        double avg;

        avg = list.length / harmonic(list);
        System.out.println("Sonuç: " + avg); // Sonuç: 2.18978102189781
    }

    static double harmonic(double[] list) {

        double harmonic = 0;

        for (double i : list)
            harmonic += 1 / i;

        return harmonic;
    }
}
