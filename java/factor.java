public class factor {
    public static void main(String args[]) {
        int Number = 100;
        System.out.print("Factor of " + Number + " are: ");
        for (int i = 1; i <= Number; ++i) {
            if (Number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
