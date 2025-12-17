public class arrayandgags {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1]) {
                System.out.println("Хуй");
            }
        }
    }
}
