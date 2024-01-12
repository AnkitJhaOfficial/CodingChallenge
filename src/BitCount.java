public class BitCount {
    public static void main(String[] args) {
        String binary = "11111111111111111111111111111101";
        int countedBitOne = countBitOne(binary);
        System.out.println(countedBitOne);
    }

    public static int countBitOne(String binary) {
        int i = Long.valueOf(binary,2).intValue();
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        i = i & 0x3f;
        System.out.println(i);

        int bitCount = Long.bitCount(Long.valueOf(binary, 2));
        System.out.println(bitCount);

        Long temp = Long.valueOf(binary, 2);
        int count = 0;
        while (temp > 0) {
            long sub = (long) Math.pow(2, (int) (Math.log(temp) / Math.log(2)));
            temp -= sub;
            count++;
        }
        return count;
    }
}
