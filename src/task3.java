public class task3 {
    public static void main(String[] args){ //выводим общее количество ног животных
        System.out.println("animals(2, 3, 5) -> " + animals (2, 3, 5));
        System.out.println("animals(1, 2, 3) -> " + animals (1, 2, 3));
        System.out.println("animals(5, 2, 8) -> " + animals (5, 2, 8));



    }
    public static int animals(int chickens, int cows, int pigs){ // вводим переменные
        return chickens*2 + cows*4 + pigs*4; //формула для подсчета
    }
}
