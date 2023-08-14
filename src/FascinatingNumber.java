public class FascinatingNumber {

    public static void main(String[] args) {
        int number = 192;
        boolean fascinatingNumber = isFascinatingNumber(number);
        if(fascinatingNumber){
            System.out.println("Fascinating");
        }
        else {
            System.out.println("Not Fascinating");
        }
    }

    public static boolean isFascinatingNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(number));
        for (int i = 2; i < 4; i++) {
            int multiple = number * i;
            stringBuilder.append(multiple);
        }
        if(stringBuilder.length()!=9){
            return false;
        }
        Integer i;
        for (i=1; i<10;i++ ) {
            if(stringBuilder.indexOf(i.toString())==-1){
                break;
            }
        }
        return i==10;
    }
}
