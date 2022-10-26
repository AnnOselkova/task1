public class task7 {
    public static void main(String[] args){ // выводим сумму чисел до числа n(вкл)
        System.out.println("addUpTo(3) -> " + addUpTo(3));
        System.out.println("addUpTo(10) -> " + addUpTo(10));
        System.out.println("addUpTo(7) -> " + addUpTo(7));
    }
    public static int addUpTo(int n) { // объявляем число n
        int sum = 0;
        for (int i = 1; i <= n; i++) { // метод, подсчитывающий сумму чисел до n
            sum += i; // прибавляем к числу следующее по порядку
        }
        return sum;
    }
}