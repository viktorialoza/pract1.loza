public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("Використання оператора циклу for:");
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nВикористання оператора циклу while:");
        int j = 500;
        while (j <= 650) {
            System.out.print(j + " ");
            j += 10;
        }

    }
}