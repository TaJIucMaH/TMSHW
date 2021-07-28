package unit3;
//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class Unit3Task2 {

    public static void main(String[] args) {
        int a = 0;
        for (int i=0; i<=99; i+=2){
            a++;}
        int[] massiv = new int[a];
        for (int i=1, b=0; i<=99; i+=2){
            a++;{
                massiv[b] = i;
                System.out.print(massiv[b]+" ");
                b++;
            }}
        System.out.println(" ");
        for(int i=massiv.length - 1; i>=0;i--){
            System.out.print(massiv[i] + " ");
    }}
}
