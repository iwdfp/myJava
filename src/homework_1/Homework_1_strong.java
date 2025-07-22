package homework_1;

public class Homework_1_strong {

    public static void main(String[] args) {

        int a = 6;
        int b = 3;
        int vr = a;
        a = b;
        b = vr;

        System.out.println(a);
        System.out.println(b);

        // *или так

        int f = 7;
        int h = 4;
        int p = f+h;
        int s = p-f;
        int r = p-h;

        System.out.println(s);
        System.out.println(r);
    }
}
