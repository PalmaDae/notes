public class Runner{
    public static void main(String[] args) {
        int[] arrayFirst = {3,5,1,6,7,3,10};

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.sort(arrayFirst);

        for (int arr : arrayFirst) {
            System.out.println(arr);
        }

    }
}
