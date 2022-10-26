public class task5 {
    public static void main(String[] args){ // выводим название операции, которая совершена над переменными
        System.out.println("operation(24, 15, 9) -> " + operation(24, 15, 9));
        System.out.println("operation(24, 26, 2) -> " + operation(24, 26, 2));
        System.out.println("operation(15, 11, 11) -> " + operation(15, 11, 11));
    }
    public static String operation(int N, int a, int b){ // вводим переменные
        if(a * b == N) return "multiplication"; //название операций
        else if(a + b == N) return "added";
        else if(a - b ==N) return"subtracted";
        else if(a / b== N) return "divided";
        else return "none";

    }
}
