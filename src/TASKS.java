public class TASKS {
    public static void main(String[] args){
        System.out.println("Задача1");
        System.out.println("remainer(1, 3) -> " + reminder(1,3));
        System.out.println("remainer(3, 4) -> " + reminder(3,4));
        System.out.println("remainer(-9, 45) -> " + reminder(-9,45));
        System.out.println("remainer(5, 5) -> " + reminder(5,5));
        System.out.println("Задача 2");
        System.out.println("triArea(3, 2) -> " + triArea(3, 2));
        System.out.println("triArea(7, 4) -> " + triArea(7, 4));
        System.out.println("triArea(10, 10) -> " + triArea(10, 10));
        System.out.println("Задача 3");
        System.out.println("animals(2, 3, 5) -> " + animals (2, 3, 5));
        System.out.println("animals(1, 2, 3) -> " + animals (1, 2, 3));
        System.out.println("animals(5, 2, 8) -> " + animals (5, 2, 8));
        System.out.println("Задача 4");
        System.out.println("profitableGamble(0.2, 50, 9) -> " + profitableGamble( 0.2, 50, 9));
        System.out.println("profitableGamble(0.9, 1, 2) -> " + profitableGamble(0.9, 1, 2));
        System.out.println("profitableGamble(0.9, 3, 2) -> " + profitableGamble(0.9, 3, 2));
        System.out.println("Задача 5");
        System.out.println("operation(24, 15, 9) -> " + operation(24, 15, 9));
        System.out.println("operation(24, 26, 2) -> " + operation(24, 26, 2));
        System.out.println("operation(15, 11, 11) -> " + operation(15, 11, 11));
        System.out.println("Задача 6");
        System.out.println("ctoa('A') -> " + ctoa('A'));
        System.out.println("ctoa('m') -> " + ctoa('m'));
        System.out.println("ctoa('[') -> " + ctoa('['));
        System.out.println("ctoa('\\') -> " + ctoa('\\'));
        System.out.println("Задача 7");
        System.out.println("addUpTo(3) -> " + addUpTo(3));
        System.out.println("addUpTo(10) -> " + addUpTo(10));
        System.out.println("addUpTo(7) -> " + addUpTo(7));
        System.out.println("Задача 8");
        System.out.println("nextEdge(8, 10) -> " + nextEdge(8, 10));
        System.out.println("nextEdge(5, 7) -> " + nextEdge(5, 7));
        System.out.println("nextEdge(9, 2) -> " + nextEdge(9, 2));
        System.out.println("Задача 9");
        System.out.println("sumOfCubes([1, 5, 9]) -> " + sumOfCubes(new int[]{1, 5, 9}));
        System.out.println("sumOfCubes([3, 4, 5]) -> " + sumOfCubes(new int[]{3, 4, 5}));
        System.out.println("sumOfCubes([2]) -> " + sumOfCubes(new int[]{2}));
        System.out.println("sumOfCubes([]) -> " + sumOfCubes(new int[]{0}));
        System.out.println("Задача 10");
        System.out.println("abcmath(42, 5, 10) -> " + abcmath(42, 5, 10));
        System.out.println("abcmath(5, 2, 1) -> " + abcmath(5, 2, 1));
        System.out.println("abcmath(1, 2, 3) -> " + abcmath(1, 2, 3));
    }
    public static int reminder(int a, int b){ // метод расчета
        return a % b;
    }
    public static int triArea( int a, int b){ //формула для расчета площади треугольника
        return (a * b)/2;
    }
    public static int animals(int chickens, int cows, int pigs){ // вводим переменные
        return chickens*2 + cows*4 + pigs*4; //формула для подсчета
    }
    public static boolean profitableGamble(double prob, double prize, double pay){ // метод, который выводит нас true или false в зависимости от неравенства
        if (prob * prize > pay){
            return true;
        }
        return false;
    }
    public static String operation(int N, int a, int b){ // вводим переменные
        if(a * b == N) return "multiplication"; //название операций
        else if(a + b == N) return "added";
        else if(a - b ==N) return"subtracted";
        else if(a / b== N) return "divided";
        else return "none";

    }
    public static int ctoa(char symbol){//метод выводящий ASCII символа
        return (int)symbol;
    }
    public static int addUpTo(int n) { // объявляем число n
        int sum = 0;
        for (int i = 1; i <= n; i++) { // метод, подсчитывающий сумму чисел до n
            sum += i; // прибавляем к числу следующее по порядку
        }
        return sum;
    }
    public static int nextEdge(int a, int b){ // вводим переменные двух сторон
        return a+b-1; // находим максимальное занчение третьей стороны использую правило, что сторона должна быть меньше, чем сумма двух других

    }
    public static int sumOfCubes(int[] arr){ //вводим массив
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.pow(arr[i], 3);//функция возведения числа в куб. Прибавляем куб одного числа, к кубу другого по порядку
        }
        return sum;
    }
    public static boolean abcmath(int a, int b, int c){//вводим значения
        for(int i = 0; i <= b; i++){
            a += a;//прибавляем а к себе b раз
        }
        return a % c == 0;//проверяем делится ли число без отсатка на c
    }

}
