public class task8 {
    public static void main(String[] args){
        System.out.println("nextEdge(8, 10) -> " + nextEdge(8, 10));
        System.out.println("nextEdge(5, 7) -> " + nextEdge(5, 7));
        System.out.println("nextEdge(9, 2) -> " + nextEdge(9, 2));
    }
    public static int nextEdge(int a, int b){
        return a+b-1;

    }
}
