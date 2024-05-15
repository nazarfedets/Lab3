//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;

        }
        System.out.println(a + "! = " + b);

        int c = 1;
        int d = 10;
        while ((d > 0)) {
            c *=d--;
        }
        System.out.println("10! = " + c);

    }
}