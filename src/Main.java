public class Main {
    public static void main(String[] args) {
        USBTypeCCharger typeCCharger = new USBTypeCCharger();
        Charger typeCAdapter = new USBTypeCAdapter(typeCCharger);
        Phone phone1 = new Phone(typeCAdapter);
        phone1.startCharging();

        WirelessCharger wirelessCharger = new WirelessCharger();
        Charger wirelessAdapter = new WirelessChargerAdapter(wirelessCharger);
        Phone phone2 = new Phone(wirelessAdapter);
        phone2.startCharging();
    }
}
