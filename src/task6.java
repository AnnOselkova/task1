public class task6 {
    public static void main(String[] args){ // выводим значения ASCII символа
        System.out.println("ctoa('A') -> " + ctoa('A'));
        System.out.println("ctoa('m') -> " + ctoa('m'));
        System.out.println("ctoa('[') -> " + ctoa('['));
        System.out.println("ctoa('\\') -> " + ctoa('\\'));
    }
    public static int ctoa(char symbol){//метод выводящий ASCII символа
        return (int)symbol;
    }
}
