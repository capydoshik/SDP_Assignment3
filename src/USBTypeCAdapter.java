public class USBTypeCAdapter implements Charger {
    private final USBTypeCCharger usbTypeCCharger;

    public USBTypeCAdapter(USBTypeCCharger usbTypeCCharger) {
        this.usbTypeCCharger = usbTypeCCharger;
    }

    @Override
    public void charge() {
        usbTypeCCharger.usbTypeCCharge();
    }
}
