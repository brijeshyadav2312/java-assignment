public class count {
    public static void main(String args[]) {
        int c = 0, n = 1230;
        while (n != 0) {
            n /= 10;
            ++c;
        }
        System.out.print(c);
    }

}
