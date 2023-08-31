package September;

public class Cellular {
    public static void main(String[] args) {
        Phone nokia = new Phone("1234567890","AMT-69", 3200);
        Phone samsung = new Phone("987654321", "VEF TA-68", 1200);
        Phone rigonda = new Phone("854619370","Jaskier-74", 800 );
        System.out.printf("Apparatus model: %s, Serial number: %s, weight: %d \n", nokia.getModel(), nokia.getNumber(), nokia.getWeight());
        System.out.printf("Apparatus model: %s, Serial number: %s, weight: %d \n", samsung.getModel(), samsung.getNumber(), samsung.getWeight());
        System.out.printf("Apparatus model: %s, Serial number: %s, weight: %d \n", rigonda.getModel(), rigonda.getNumber(), rigonda.getWeight());
        nokia.receiveCall("Kremlin");
        System.out.println(nokia.getStatus());
        nokia.hangup();
        System.out.println(nokia.getStatus());

    }
}
