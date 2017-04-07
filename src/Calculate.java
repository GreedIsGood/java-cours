/**
 * Created by Константин on 08.04.2017.
 */
public class Calculate {
    public static void main(String[] args) {
        System.out.println("Summ " + (Integer.valueOf(args[0]) + Integer.valueOf(args[1])));
        System.out.println("Division " + (Integer.valueOf(args[0]) / Integer.valueOf(args[1])));
        System.out.println("Multiplication " + (Integer.valueOf(args[0]) * Integer.valueOf(args[1])));
        System.out.println("Difference " + (Integer.valueOf(args[0]) - Integer.valueOf(args[1])));
    }
}
