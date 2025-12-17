public class Hueta {

    public static void main(String[] args) {

        char[] text = {
                'c','p','r','i','n','g', ' ',
                'c','e','r','p',' ',
                'c','e','g','o','d','n','a',' ',
                'm','o','l','o','t','\n'
        };

        int wordCount = 0;

        char[] word = new char[100];
        int wordLen = 0;

        for (int i = 0; i < text.length; i++) {

            if (text[i] != ' ' && text[i] != '\n') {
                word[wordLen] = text[i];
                wordLen++;
            } else {
                if (wordLen > 0) {
                    wordCount++;

                    if (word[0] == 'c' && wordLen > 4) {
                        for (int j = 0; j < wordLen; j++) {
                            System.out.print(word[j]);
                        }
                        System.out.println();
                    }

                    wordLen = 0;
                }

                if (text[i] == '\n') {
                    break;
                }
            }
        }

        System.out.println("Количество слов: " + wordCount);
    }
}
