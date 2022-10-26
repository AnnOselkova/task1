public class task4 {
    public static void main(String[] args){// выводим правильность неравенства
        System.out.println("profitableGamble(0.2, 50, 9) -> " + profitableGamble( 0.2, 50, 9));
        System.out.println("profitableGamble(0.9, 1, 2) -> " + profitableGamble(0.9, 1, 2));
        System.out.println("profitableGamble(0.9, 3, 2) -> " + profitableGamble(0.9, 3, 2));
    }
    public static boolean profitableGamble(double prob, double prize, double pay){ // метод, который выводит нас true или false в зависимости от неравенства
        if (prob * prize > pay){
            return true;
        }
        return false;
    }
}