// Задание 1.
// Программа принимает строку результата булевой функции и строит СКНФ.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SKNFBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите результат функции (например 0110): ");
        String s = sc.nextLine().trim();
        int rows = s.length();

        Integer hdsa = 1;

        int n = (int) Math.round(Math.log(rows) / Math.log(2));
        System.out.println("Определено количество переменных: n = " + n);


        //Перенос элементов которые написал юзер в массив
        int[] vals = new int[rows];
        for (int i = 0; i < rows; i++) {
            char c = s.charAt(i);
            vals[i] = c - '0';
            System.out.println(vals[i]);
        }

        List<String> maxterms = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            if (vals[i] == 0) {
                String term = "("; // старт макситерма

                for (int bit = n - 1; bit >= 0; bit--) {
                    int ai = (i >> bit) & 1;
                    String var = "x" + (n - bit);

                    if (ai == 0) {
                        term = term + var;
                    } else {
                        term = term + "¬" + var;
                    }

                    if (bit != 0) {
                        term = term + " ∨ ";
                    }
                }

                term = term + ")";
                maxterms.add(term);
            }
        }

        System.out.println();
        System.out.println("СКНФ функции:");


        String result = "";
        for (int i = 0; i < maxterms.size(); i++) {
            result = result + maxterms.get(i);
            if (i != maxterms.size() - 1) {
                result = result + " ∧ ";
            }
        }
        System.out.println(result);


        sc.close();
    }
}
