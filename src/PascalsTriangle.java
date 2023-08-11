public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 10;
        printPascalsTriangle(n);
    }

    private static void printPascalsTriangle(int n) {
        int[] array = null;
        int[] tempArray;
        for (int i = 1; i <= n; i++) {
            tempArray = new int[i];

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                if (j == 0 || j == tempArray.length - 1) {
                    tempArray[j] = 1;
                } else {
                    tempArray[j] = array[j - 1] + array[j];
                }
                System.out.print(tempArray[j] + " ");
            }
            array = tempArray;
            System.out.println();
        }

    }
}