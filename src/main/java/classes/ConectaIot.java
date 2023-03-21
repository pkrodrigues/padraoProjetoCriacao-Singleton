package classes;

public class ConectaIot {
    private ConectaIot() {};
    private static ConectaIot instance = new ConectaIot();
    public static ConectaIot getInstance() {
        return instance;
    }

    private String nameDevice;
    private String addressIp;

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public String getAddressIp() {
        return addressIp;
    }

    public void setAddressIp(String addressIp) {
        this.addressIp = addressIp;
    }
}
