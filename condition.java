import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;

public class condition {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if (button == 1) {
        // System.out.println("Hello");
        // } else if (button == 2) {
        // System.out.println("Namaste");
        // } else if (button == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("Invalid Button");
        // }

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }

    }
}