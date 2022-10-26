public class task1 {
    public static void main(String[] args){ // выводим остаток от деления
        System.out.println("remainer(1, 3) -> " + reminder(1,3));
        System.out.println("remainer(3, 4) -> " + reminder(3,4));
        System.out.println("remainer(-9, 45) -> " + reminder(-9,45));
        System.out.println("remainer(5, 5) -> " + reminder(5,5));


    }
    public static int reminder(int a, int b){ // метод расчета
        return a % b;
    }
}
