package homework_1;

public class Homework_1_3 {

    public static void main(String[] args) {
        int n = 521;
        int b = 5;
        int c = 2;
        int z = 1;
        int sumn = b + c + z;
        // *либо же так, чтоб вручную не менять цифры
        int m = 868;
        int firstNum = m / 100;
        int twoNum = (m % 100) / 10;
        int threeNum = (m % 100) % 10;
        System.out.println(sumn);
        System.out.println(firstNum + twoNum + threeNum);
    }
}
