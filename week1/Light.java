public class Light extends SmartDevice {
    Light(String name) {
        super(name);
    }

    void showStatus() {
        System.out.println(name + " is ON");
    }
}
