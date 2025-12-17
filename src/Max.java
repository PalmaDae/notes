public class Max {

    public static void main(String[] args) {

        char[] text = {
                'а','б','р','а','к','а','д','а','б','р','а','.'
        };

        char maxChar = 0;
        int maxCount = 0;

        for (int i = 0; i < text.length; i++) {

            if (text[i] == '.') {
                break;
            }

            int count = 0;

            for (int j = 0; j < text.length; j++) {
                if (text[j] == '.') {
                    break;
                }
                if (text[j] == text[i]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = text[i];
            }
        }

        System.out.println("Самый частый символ: " + maxChar);
        System.out.println("Количество: " + maxCount);
    }
}
