public class Switch extends Networking {
    private String vlan;

    public Switch(String id, String ipAddress, String vlan) {
        super(id, ipAddress);
        this.vlan = vlan;
    }

    @Override
    public String poll() {
        return "Switch " + getId() + " polled. VLAN: " + vlan;
    }
}
