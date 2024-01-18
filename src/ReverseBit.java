public class ReverseBit {
    public static void main(String[] args) {
        int n = Integer.valueOf("00000010100101000001111010011100", 2);
        int reverseBits = reverseBits(n);
        System.out.println(reverseBits);

    }

    public static int reverseBits(int i) {
        return Integer.reverse(i);
    }
}
