import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
//        //Как мы строим переменные 0_0
//        // ТИП_ДАННЫХ ИМЯ_ПЕРЕМЕННОЙ = ЗНАЧЕНИЕ+ПЕРЕМЕНОЙ; -_O
//        // == - Сравнение равны  ли хуйни
        // != - Не равно
        // = - говорим что теперь эта хуйня равна другой хуйне
//
//        int x = 5;
//        int y = 10;
//        int i = 15;
//
//        String f = "Сосите член";
//        String r = "Артур умничка";
//
//        Boolean e = true;
//        Boolean h = false;
//
//        double t = 0.5;
//        float v = 1.5F;
//
//        char p = '*';
//
//        System.out.println(f);
//        System.out.println(r);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String строка = scanner.nextLine();
//
//        System.out.println(строка);

//         int x = 13;
//         while (x < 18) {
//             System.out.println(x);
//             x++;
////             x = x +1;
////             x+=1;

//         }

//        Scanner scanner = new Scanner(System.in);
//
//        int x = 15;
//        while (x!= 20) {
//            System.out.println(x);
//            x = scanner.nextInt();
//
//        }

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите x");
//
//        int x = scanner.nextInt();
//
//        if (x == 5) {
//            System.out.println("вагина");
//
//        } else if (x == 2) {
//            System.out.println("хуй");
//
//        } else {
//            System.out.println("артур");
//
//        }

//         Scanner scanner = new Scanner(System.in);
//
//         double y = 0;
//         System.out.println("Введите число x");
//         double x = scanner.nextDouble();
//         System.out.println("Введите число n");
//         int n = scanner.nextInt();
//         int cnt = 1;
//         while (cnt <= n) {
//             y += Math.pow(x, cnt) / cnt;
//             cnt++;
//         }
//
//         y*=-1;
//
//        System.out.println("Вывод с помощью ряда");
//
//         System.out.println(y);
//
//
//        System.out.println("Вывод через стандартную функцию");
//         double t = Math.log10(1-x);
//
//         System.out.println(t);
        //Типы данных 0-0
        //int - целые числа, double - вещественные, String - строки,  boolean - истина, ложь
        //
         //Условные операторы
//        if (условие) {
//            тело
//        }
//        if (условие) {
//            если подходит под условие
//        } else {
//            если не подходит под условие
//        }
//
//        if (УСЛОВИЕ1) {
//            если подходит условие 1
//        } else if (УСЛОВИЕ2) {
//            если подходит условие 2
//        } else if (УСЛОВИЕ3) {
//            если подходит условие 3
//        } else {
//            если никакое не подходит
//        }

        //Циклы
//        while (условие) {
//            Делаем пока условие истинно
//        }
//        for (ВРЕМЕННАЯ ПЕРЕМЕННАЯ ; УСЛОВИЕ ; ШАГ) {
//            делаем пока условие истинно
//        }

        //ТИП_ДАННЫХ[] ИМЯ_МАССИВА = new ТИП_ДАННЫХ[РАЗМЕР];
        //Обращение к элементу массива, в данном случае по индексу -->  ИМЯ_МАССИВА[ИНДЕКС]
//
//        int[] array = new int[10];
//
//
//        //тут мы говорим, что i'й элемент массива равен i
//        for (int i = 0; i < 10; i++) {
//            array[i] = i;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(array[i]);
//        }
//
//        //0) Создать массив из 5,10,1 элементов МОЖНО ПУСТЫЕ 0-0
//        int [] array = new int [5];
//        int [] array2 = new int [10];
//        int [] array3 = new int [1];
//
//        //1) Заполнить массив, числами от 10 до 15
//        int [] array4 = new int [6];
//        for (int i=0;i<=5;i++) {
//            array4[i]=i+10;
//            System.out.println(array4[i]);
//        }
//
//
//        //2) Заполнить массив числами, которые больше их индекса на 1
//         int [] array5 = new int[10];
//        for (int i=0; i<=5; i++) {
//            array5[i]=i+1;
//            System.out.println(array5[i]);
//        }
//
//
//
//        //3)
//        int[] arr = {1,23,2,32,32,4,5};
//
//
//        for (int i = 0 ; i < arr.length ; i++) {
//            if (arr[i] %2 == 0) {
//                arr[i] = 5;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите кол-во элементов в последовательности");
//
//        int n = scanner.nextInt();
//        int cnt = 0;
//
//        for (int i=1;i<=n;i++ ){
//            System.out.println("Введите число");
//            int x = scanner.nextInt();
//            if (x%3==0 && x%5!=0){
//                cnt++;
//            }
//
//        }
//        System.out.println(cnt);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов последовательности");
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int b = 1;
        for (int i=1; i<=n; i++){
            System.out.println("Введите число");
            int x = scanner.nextInt();
        if (max<=x){
            max = x;
            b = i;
        }
        }

        System.out.println(max);
        System.out.println(b);

    }

}
