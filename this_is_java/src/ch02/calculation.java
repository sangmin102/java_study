import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요:");
        int inputA = scanner.nextInt();
        System.out.print("숫자를 입력하세요:");
        int inputB = scanner.nextInt();

        System.out.println(inputA + "+" + inputB + (inputA + inputB));
        System.out.println(inputA + "-" + inputB + (inputA - inputB));
        System.out.println(inputA + "+" + inputB + (inputA * inputB));
        System.out.printf(" %d / $d = %5.2f" , inputA, inputB, ((float)inputA/inputB));
    }
}
