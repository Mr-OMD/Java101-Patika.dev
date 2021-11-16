public class DiziFrekans {
    static boolean isThere(int[] arr, int number) {

        for (int i : arr)
            if (i == number)
                return true;
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20, 5, 6, 10, 20, 6};
        int[] duplicate = new int[arr.length];
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int k : arr) {

                if (arr[i] == k) {
                    if (!isThere(duplicate, arr[i]))
                        duplicate[i] = arr[i];
                    counter++;
                }
            }
            if (duplicate[i] != 0)
                System.out.println(duplicate[i] + " sayısı " + counter + " kere tekrar edildi.");

            counter = 0;
        }
    }
}
