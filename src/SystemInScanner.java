import java.util.Scanner;

class SystemInScanner extends EventSource {
    public void scanSystemIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Text: ");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            notify(line);
        }
    }
}