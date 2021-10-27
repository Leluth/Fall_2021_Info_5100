package Question2Solution;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Printer
 * @date 2021/10/26 19:05
 */
class Printer {
    private static Printer printer;

    private Printer() {
    }

    public static synchronized Printer getInstance() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    private void getConnection() {
        System.out.println("Your Printer is working");
    }

    static class Main {
        public static void main(String[] args) {
            Printer p1;
            // refers to the only object of Database
            p1 = Printer.getInstance();
            p1.getConnection();
        }
    }
}
