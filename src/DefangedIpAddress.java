public class DefangedIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String defangedVersionOfIp = defangedVersionOfIp(address);
        System.out.println(defangedVersionOfIp);
    }

    public static String defangedVersionOfIp(String ipAddress){
        return ipAddress.replaceAll("\\.", "[.]");
    }

}
