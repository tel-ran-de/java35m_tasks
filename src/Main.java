public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Rectangle rectangleEmpty = new Rectangle(0,0);
        Rectangle rectangle=new Rectangle(1,2);
        Rectangle rectangle1=new Rectangle(3,4);


        rectangleEmpty.getArea(2,6);
        System.out.println("rectangle empty length= "+rectangleEmpty.length);
        ;



        System.out.println("Area of rectangle= "+rectangle.getArea(0,0));
        System.out.println("Area of rectangle1= "+rectangle1.getArea(0,0));
        System.out.println("Perimeter of rectangle= "+rectangle.getPerimeter());
        System.out.println("Perimeter of rectangle1= "+rectangle1.getPerimeter());

        // write your code here
        int[] ints ={5,10,45,7,10,8,10};
        //    System.out.println(isSumNEqualsM(ints,10,30));//true
        //    System.out.println(isSumNEqualsM(ints,5,30));//false


        int[]numbers={4,2,1,5,3};
        int[]numbers1={4,2,1,5,3,5};
        System.out.println(isConsecutive(numbers,numbers.length));//true
        System.out.println(isConsecutive(numbers1,numbers1.length));//false


    }


    //  4. Есть не пустой целочисленный массив. Написать метод, проверяющий равна ли сумма элементов n
    //    // числу m. Вернуть true  если да false  если нет
    //    // {5,10,45,7,10,8,10}->  равна ли сумма десяток тридцати.
    public static boolean isSumNEqualsM (int[]numbers, int num, int sum){
        int tempSum =0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==num){
                tempSum+=num;
            }
            if(tempSum>sum){
                break;}
        }
        return tempSum==sum;
    }



    //5**. Есть массив целых чисел. Написать метод, проверяющий содержит ли массив последовательные элементы
    //    4,2,1,5,3 -> true  5 -1 = 4
    //    4,2,1,6,3 -> false
    //    4,2,1,5,3,5 -> false
    //    7,5,6,3,4,3,3 -> true   7-3 =4

    //  max-min +1 ==n

    private static int getMinimum (int arr[],int n){
        int min =arr[0];

        for(int i=1;i<n;i++)
            if(arr[i]<min)
                min=arr[i];
        return min;
    }

    private static int getMaximum(int arr[],int n){
        int max = arr[0];
        for(int i=1;i<n;i++)
            if(arr[i]>max)
                max=arr[i];
        return max;
    }

    public static boolean isConsecutive(int[] arr,int n){
        if(n<1)
            return false;

        int min = getMinimum(arr,n);
        int max = getMaximum(arr,n);

        if(max-min+1==n){
            boolean[] visited = new boolean[arr.length];
            // 2,1,3,2
            for(int i=0;i<n;i++){
                if(visited[arr[i]-min])
                {return false;}
                //visited[1]=true;
                visited[arr[i]-min]=true;           //visited[0]=true;
            }                                       //visited[2]=true;
            return true;
        }

        return false;

    }

    // 1. Создать класс "Rectangle" , предоставляющий возможность вычисления площади и периметра
    // прямоугольника. area= length*breadth;  perimeter= 2*(length+breadth). Длина и ширина
    // передаются как параметры конструктора. Создать несколько обьектов этого класса и вывести их на экран

    //2. Создать класс Average , имеющий метод для подсчета среднеарифметического трех целых чисел.
    // Числа передаются через конструктор. Создать несколько обьектов этого класса и вывести на экран результат
    // работы метода для них.

    //3. Создать класс "Employee", имеющий:
    // - конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
    // - следующие методы: addSalary() , который добавляет 10 евро к зврплате сотрудника если она меньше 500
    // и addWork() , добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
    // Создать несколько сотрудников и применить к ним методы

    //4.Создать метод, вычисляющий индекс массы тела (BMI)  и  печатающий результат:
    // Метод использует вес в килограммах и рост в метрах.  .
    // Метод должен быть в классе Body и выодить следующее сообщение:
    //"Underweight" если BMI  меньше 18.5
    // "Normal" if 18.5<=BMI<25
    // "Overweight" 25<=BMI<30
    // Obese  BMI>=30
    // формула для расчета BMI = weight/height*height

    //вес и рост передаются через конструктор



}
