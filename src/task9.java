public class task9 {
    public static void main(String[] args){ //выводим массив суммы кубов
        System.out.println("sumOfCubes([1, 5, 9]) -> " + sumOfCubes(new int[]{1, 5, 9}));
        System.out.println("sumOfCubes([3, 4, 5]) -> " + sumOfCubes(new int[]{3, 4, 5}));
        System.out.println("sumOfCubes([2]) -> " + sumOfCubes(new int[]{2}));
        System.out.println("sumOfCubes([]) -> " + sumOfCubes(new int[]{0}));
    }
    public static int sumOfCubes(int[] arr){ //вводим массив
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.pow(arr[i], 3);//функция возведения числа в куб. Прибавляем куб одного числа, к кубу другого по порядку
        }
            return sum;
    }
}
