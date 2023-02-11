package Main;

public class Main {
    public static void main(String[] args) {
        int[] kolbasa = {1,3,5,7,9}; //объявил массив и задал 5 любых целых чисел (задание 1)

        int pervii = kolbasa[0];
        int last = kolbasa[kolbasa.length - 1];
        int buf = pervii;
        pervii = last;
        last = buf; // замена первого и последнего элементов массива (задание 2)

        int mid = kolbasa[kolbasa.length / 2]; //значение среднего элемента массива
        int sum = pervii + mid;
        System.out.println(sum); //(задание 3)
    }

}