public class Router extends Networking {
    private int portCount;

    public Router(String id, String ipAddress, int portCount) {
        super(id, ipAddress);
        this.portCount = portCount;
    }

    @Override
    public String poll() {
        // In real code — send SNMP GET, check response
        return "Router " + getId() + " polled. Ports: " + portCount;
    }
}
