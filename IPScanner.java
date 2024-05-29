import java.io.IOException;
import java.net.InetAddress;

public class IPScanner {

    public static void main(String[] args) {
        String baseIP = "192.168.1"; // Specify the base IP address without the last octet
        int startRange = 1;
        int endRange = 255;

        for (int i = startRange; i <= endRange; i++) {
            String ipAddress = baseIP + "." + i;
            try {
                if (InetAddress.getByName(ipAddress).isReachable(1000)) {
                    System.out.println(ipAddress + " is reachable");
                } else {
                    System.out.println(ipAddress + " is not reachable");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
