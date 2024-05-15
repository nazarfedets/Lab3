//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 2*a-1;
        for(;b<5000; a++,b=2*a-1)
            System.out.println(b);

    }
}