public class Swap2var {
    
    public static void main(String[] args) {

        String A = "Football";
        String B = "Volleyball";
        String temp;

        temp = A;
        A = B;
        B = temp;

        System.out.println("A: " + A);
        System.out.println("B: " + B);

    }
}
