public class DeviceFlags {
    // Each flag is a power of 2 — occupies exactly one bit
    static final int FLAG_ONLINE    = 0b0001;  // 1
    static final int FLAG_MONITORED = 0b0010;  // 2
    static final int FLAG_ALERTING  = 0b0100;  // 4
    static final int FLAG_CRITICAL  = 0b1000;  // 8
    
    public static void main(String[] args) {
        // Device is online and being monitored
        int deviceState = FLAG_ONLINE | FLAG_MONITORED;   // 0011 = 3

        // Check if device is online
        boolean isOnline = (deviceState & FLAG_ONLINE) != 0;
        System.out.println("Online: " + isOnline);   // true

        // Add alerting flag
        deviceState = deviceState | FLAG_ALERTING;   // 0111 = 7

        // Remove monitored flag
        deviceState = deviceState & ~FLAG_MONITORED;  // 0101 = 5

        // Check all flags
        System.out.println("Online: "    + ((deviceState & FLAG_ONLINE) != 0));
        System.out.println("Monitored: " + ((deviceState & FLAG_MONITORED) != 0));
        System.out.println("Alerting: "  + ((deviceState & FLAG_ALERTING) != 0));
    }
}