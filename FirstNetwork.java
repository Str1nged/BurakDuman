package Mithat_Duman_64334;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FirstNetwork {

    public static void main(String[] args) {

        try {
            if (args.length == 0) {
                System.out.println("Użycie: java firstnetwork.FirstNetwork <hostname lub adres IP>");
                return;
            }

            String host = args[0];
            InetAddress node = InetAddress.getByName(host);

            System.out.println("========================================");
            System.out.println("Podany host: " + host);
            System.out.println("Adres IP: " + node.getHostAddress());
            System.out.println("Nazwa hosta: " + node.getHostName());
            System.out.println("Kanoniczna nazwa hosta: " + node.getCanonicalHostName());

            System.out.println("----------------------------------------");
            if (node.isReachable(2000)) {
                System.out.println("Host " + host + " jest osiągalny ");
            } else {
                System.out.println("Host " + host + " nie odpowiada ");
            }

            if (node.isLoopbackAddress()) {
                System.out.println("To jest adres loopback (localhost)");
            }

            if (node.isMulticastAddress()) {
                System.out.println("Adres " + node.getHostAddress() + " jest typu multicast 📡");
            } else {
                System.out.println("Adres " + node.getHostAddress() + " nie jest typu multicast");
            }

            byte[] ipBytes = node.getAddress();
            String ipHash = getHash(ipBytes);
            System.out.println("Skrót (SHA-256) adresu IP: " + ipHash);

            InetAddress nodeByIP = InetAddress.getByAddress(ipBytes);
            System.out.println("----------------------------------------");
            System.out.println("Test połączenia przez getByAddress():");
            if (nodeByIP.isReachable(2000)) {
                System.out.println("Host " + nodeByIP.getHostAddress() + " jest osiągalny przez getByAddress() ");
            } else {
                System.out.println("Host " + nodeByIP.getHostAddress() + " nie odpowiada przez getByAddress() ");
            }

            System.out.println("----------------------------------------");
            System.out.println("Skanowanie sieci: " + getNetworkPrefix(node.getHostAddress()) + ".0/24");
            scanNetwork(node.getHostAddress());

            System.out.println("========================================");

        } catch (UnknownHostException e) {
            System.out.println("Nieznany host: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }

    private static String getHash(byte[] data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(data);
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    private static String getNetworkPrefix(String ip) {
        String[] parts = ip.split("\\.");
        return parts[0] + "." + parts[1] + "." + parts[2];
    }

    private static void scanNetwork(String ip) {
        String prefix = getNetworkPrefix(ip);
        for (int i = 1; i < 255; i++) {
            String testIP = prefix + "." + i;
            try {
                InetAddress testNode = InetAddress.getByName(testIP);
                if (testNode.isReachable(50)) {
                    System.out.println("Aktywny host: " + testIP);
                }
            } catch (Exception e) {
            }
        }
    }
}
