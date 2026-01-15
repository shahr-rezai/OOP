public class SmartDevice {
    String name;

    SmartDevice(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " is now ON.");
    }

    void turnOff() {
        System.out.println(name + " is now OFF.");
    }
}
