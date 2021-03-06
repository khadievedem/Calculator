import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static numberInspector Inspector = new numberInspector();

    public static void main(String[] args) {
        String result = Inspector.Inspect(scanner.nextLine());
        System.out.println(result);

    }
}
