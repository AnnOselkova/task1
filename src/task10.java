public class task10 {
    public static void main(String[] args){ // проверяем делится ли число без остатка на c или нет
        System.out.println("abcmath(42, 5, 10) -> " + abcmath(42, 5, 10));
        System.out.println("abcmath(5, 2, 1) -> " + abcmath(5, 2, 1));
        System.out.println("abcmath(1, 2, 3) -> " + abcmath(1, 2, 3));
    }
    public static boolean abcmath(int a, int b, int c){//вводим значения
        for(int i = 0; i <= b; i++){
            a += a;//прибавляем а к себе b раз
        }
        return a % c == 0;//проверяем делится ли число без отсатка на c
    }
}
