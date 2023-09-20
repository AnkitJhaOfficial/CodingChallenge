public class RotateDBits {
    public static void main(String[] args) {
        int d = 2;
        int number = 29;
        rotateBitsLeftAndRight(number, d);
    }

    public static void rotateBitsLeftAndRight(int n, int d) {
        int temp = n;

        double rightSum = 0;
        double leftSum = 0;
        while (temp > 0) {
            double sub = Math.pow(2, (int) (Math.log(n) / Math.log(2)));
            int currentBitIndex = (int) (Math.log(n) / Math.log(2));

            int rightShitedBitIndex = 0;
            int leftShitedBitIndex = 0;
            if (currentBitIndex - d >= 0) {
                rightShitedBitIndex = currentBitIndex - d;
            } else {
                rightShitedBitIndex = 16 - currentBitIndex - d;
            }

            if (currentBitIndex + d >= 16) {
                leftShitedBitIndex = 16 - currentBitIndex + d;

            } else {
                leftShitedBitIndex = currentBitIndex + d;
            }

            rightSum = rightSum + Math.pow(2, rightShitedBitIndex);
            leftSum = leftSum + Math.pow(2, leftShitedBitIndex);
            temp -= sub;
            n = temp;
        }
        System.out.println((int) leftSum);
        System.out.println((int) rightSum);

    }
}
