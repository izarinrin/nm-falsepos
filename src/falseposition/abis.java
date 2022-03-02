/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package falseposition;

/**
 *
 * @author mayni
 */
public class abis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double a = 0.0, b = 1.0, c = 0.0, tol = 0.0001, fa = 0.0, fb = 0.0, fc = 0.0, e = 0.0, co = 0.0;
        int i = 0;
        Boolean tolcheck = false;

        System.out.println("[a          ,b          ,c          ,f(a)          ,f(b)          ,f(c)]          ,e");
        while (!tolcheck) {
            co = c;
            c = (a + b) / 2.0;//bisection
            fa = function(a);
            fb = function(b);
            fc = function(c);
            i++;
            System.out.printf("%.9f", a);
            System.out.print(" ");
            System.out.printf("%.9f", b);
            System.out.print(" ");
            System.out.printf("%.9f", c);
            System.out.print(" ");
            System.out.printf("%.9f", fa);
            System.out.print(" ");
            System.out.printf("%.9f", fb);
            System.out.print(" ");
            System.out.printf("%.9f", fc);

            if ((fb * fc) < 0) {
                a = c;
            } else {
                b = c;
            }
            e = (double) ((c - co) / (double) (c));
            if ((Math.abs(e)) <= tol) {
                tolcheck = true;
            }
            System.out.print(" ");
            System.out.printf("%.4f", (Math.abs(e)) * 100);
            System.out.print("%");
            System.out.println("  iteration #" + i);
        }
        System.out.println("The root of the function is using bisection is " + c);
    }

    static double function(double num) {
        double kani = 7*Math.pow(num, 9) - 3 - Math.sin(num)-0.782*num;
        return kani;
    }

}
