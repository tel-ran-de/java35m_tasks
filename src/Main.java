public class Main {

    public static void main(String[] args) {

        int a1 = 5;
        int b = 6;
        int c = 7;
        int d = 9;

        int x;
        int[] array= new int[10];
        int[] array1= new int[]{73,22,3234,489,45};
        int[] array3= new int[]{73,22,0,3234,489,45};
        int[] array4= new int[]{73,22,3234,489,45,1};
        int[] array5= new int[]{73,22,0,3234,489,45,1};
        //   System.out.println(findmax(array1));//3234
        int[] array2={2,5};
        int[] array6={2,5};
        int[] array7={5,2};
        System.out.println(areEqual(array2,array6));//true
        System.out.println(areEqual(array2,array7));//false
        System.out.println(isWithoutOnesOrZeros(array1));//true
        System.out.println(isWithoutOnesOrZeros(array3));
        System.out.println(isWithoutOnesOrZeros(array4));
        System.out.println(isWithoutOnesOrZeros(array5));


        //     System.out.println(array1[65]);


        // System.out.println(array1[0]);

        for(int i=0;i<array1.length;i++)
            System.out.println(array1[i]);

        System.out.println("____________________________________");

        array1[1]=987;

        for(int element:array1)
            System.out.println(element);


        // - - - - - - - - -




        //1. Есть целочисленный массив не нулевой. Написать метод, возвращающий
        // true если в этом массиве нет 0 или нет 1
        // {4,1,9}-> false
        // {4,9,0}-> false
        // {4,1,9,0}-> false
        // {4,6,9,8}-> true

        //2.Написать метод, проверяющий равенство двух целочисленных массивов
        //{3,2,1},{3,2,1} -> true
        //{3,1,2},{3,2,1} -> false

        //3. Есть два целочисленных не пустых массива . написать метод, находяший общие элементы
        //    // между двумя массивами и вывести их на экран
        //    // {3,1,5},{5,6,8}-> 5

        //4. Есть не пустой целочисленный массив. Написать метод, проверяющий равна ли сумма элементов n
        //    // числу m. Вернуть true  если да false  если нет
        //    // {5,10,45,7,10,8}->  равна ли сумма десяток тридцати.
        //    // public static boolean isSumNEqualsM (int[]numbers, int num, int sum)

        //5**. Есть массив целых чисел. Написать метод, проверяющий содержит ли массив последовательные элементы
        //    4,2,1,5,3 -> true  5 -1 = 4
        //    4,2,1,6,3 -> false
        //    4,2,1,5,3,5 -> false
        //    7,5,6,3,4,3,3 -> true   7-3 =4
        //
    }
    //int[] array1= new int[]{73,22,3234,489,45};
    public static int findmax(int[] numbers){
        int max = numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }

        return max;
    }

    //1. Есть целочисленный массив не нулевой. Написать метод, возвращающий
    // true если в этом массиве нет 0 или нет 1
    // {4,1,9}-> false
    // {4,9,0}-> false
    // {4,1,9,0}-> false
    // {4,6,9,8}-> true

    public static boolean isWithoutOnesOrZeros ( int[] ints){
        for(int i=0;i<ints.length;i++){
            if (ints[i]==0 || ints[i]==1){
                return false;

            }
        }

        return true;
    }

    //2.Написать метод, проверяющий равенство двух целочисленных массивов
    //{3,2,1},{3,2,1} -> true
    //{3,1,2},{3,2,1} -> false
    public static boolean areEqual(int[]array1,int[]array2){
        if(array1.length != array2.length)
            return false;

        for(int i=0;i<array1.length;i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    }

    //3. Есть один целочисленный не пустой массив . написать метод, находяший повторяющиеся элементы
    //    //  массива и вывести их на экран
    //    // {3,1,5,6,8,5}-> 5

    public static void findDuplicates(int[] array){
        for (int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }

}
