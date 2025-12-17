public class GlassnyeBukviNadoPodcherknutPJ {


    public static boolean isValid(char symb) {
        char arr[] = {'a','A','e','E','I','i','y','Y','u','U','o','O'};

        for (int i=0;i< arr.length;i++){
            if (symb == arr[i]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        char arr[] = {'d','Y','H','T','o','A','s','R','i','.'};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        for (int r=0;r<arr.length;r++){
            if (isValid(arr[r])) {
                arr[r] = '_';
            }
        }

        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
