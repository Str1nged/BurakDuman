package Mithat_Duman_64334;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class Interfaces {

    public static void main(String[] args) {
        try {
            System.out.println("===== Wszystkie interfejsy i ich MAC =====");
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface ni = networkInterfaces.nextElement();
                String name = ni.getDisplayName();
                System.out.println(name + ": " + formatMacAddress(ni.getHardwareAddress()));
            }

            if (args.length > 0) {
                String interfaceName = args[0];
                NetworkInterface selected = NetworkInterface.getByName(interfaceName);
                if (selected != null) {
                    System.out.println("\n===== Wybrany interfejs =====");
                    System.out.println("Nazwa: " + selected.getName());
                    System.out.println("MAC: " + formatMacAddress(selected.getHardwareAddress()));
                    System.out.println("Przypisane adresy IP:");
                    for (InterfaceAddress ia : selected.getInterfaceAddresses()) {
                        System.out.println("  " + ia.getAddress());
                    }
                } else {
                    System.out.println("Nie znaleziono interfejsu: " + interfaceName);
                }
            }

            System.out.println("\n===== Podsumowanie wszystkich interfejsów =====");
            Enumeration<NetworkInterface> allInterfaces = NetworkInterface.getNetworkInterfaces();
            while (allInterfaces.hasMoreElements()) {
                NetworkInterface ni = allInterfaces.nextElement();
                if (ni.isVirtual()) continue;
                String name = ni.getName();
                if (ni.isLoopback()) name += " (loopback)";
                System.out.println("Interface: " + name + ", MTU: " + ni.getMTU());
                for (InterfaceAddress ia : ni.getInterfaceAddresses()) {
                    System.out.println("  IP: " + ia.getAddress()
                            + " /" + ia.getNetworkPrefixLength()
                            + " Broadcast: " + ia.getBroadcast());
                }
            }

        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    private static String formatMacAddress(byte[] mac) {
        if (mac == null) return "N/A";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        }
        return sb.toString();
    }
}
