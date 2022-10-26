public class task2 {
    public static void main(String[] args){ // выводим площадь тругольника имея входные данные(основания и высота)
        System.out.println("triArea(3, 2) -> " + triArea(3, 2));
        System.out.println("triArea(7, 4) -> " + triArea(7, 4));
        System.out.println("triArea(10, 10) -> " + triArea(10, 10));
    }
    public static int triArea( int a, int b){ //формула для расчета площади треугольника

        return (a * b)/2;
    }
}
