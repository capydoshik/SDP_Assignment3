public class WirelessChargerAdapter implements Charger {
    private final WirelessCharger wirelessCharger;

    public WirelessChargerAdapter(WirelessCharger wirelessCharger) {
        this.wirelessCharger = wirelessCharger;
    }

    @Override
    public void charge() {
        wirelessCharger.startWirelessCharging();
    }
}
