public class CountSetBit {
    public static void main(String[] args) {
        int x = 136;
        int countBit = countBit(x);
        System.out.println(countBit);
    }

    public static int countBit(int n) {
        int temp = n;
        int count = 0;
        while (temp > 0) {
            double sub = Math.pow(2, (int) (Math.log(n) / Math.log(2)));
            temp -= sub;
            count++;
            n = temp;
        }
        return count;
    }
}
