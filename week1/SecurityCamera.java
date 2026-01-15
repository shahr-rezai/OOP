public class SecurityCamera extends SmartDevice {
    SecurityCamera(String name) {
        super(name);
    }

    void recordVideo() {
        System.out.println(name + " is recording video.");
    }
}
