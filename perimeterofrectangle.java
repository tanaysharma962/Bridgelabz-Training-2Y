import java.util.*;
public class perimeterofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        int Perimeter = 2 * (length + breadth);

        System.out.println(Perimeter);
    }

}
