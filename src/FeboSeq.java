import java.lang.reflect.Array;
import java.util.Scanner;

public class FeboSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aNum = 0, bNum = 1, cNum = 2, running = 2;
        System.out.println("Please enter the required feb sequence");
        int input = scanner.nextInt();
        if (input == 0) {
            System.out.println("0");
        } else if (input == 1) {
            System.out.println("1");
        } else {
            while (input >= running) {
                cNum = aNum + bNum;
                aNum = bNum;
                bNum = cNum;
                running++;
            }
            System.out.println(cNum);
        }
    }
}
