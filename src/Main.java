import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân cần chuyển đổi: ");
        int decimal = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        while (decimal != 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        System.out.print("Số nhị phân tương ứng là: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}