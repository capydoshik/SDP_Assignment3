public class Phone {
    private final Charger charger;

    public Phone(Charger charger) {
        this.charger = charger;
    }

    public void startCharging() {
        System.out.println("Phone is ready to charge");
        charger.charge();
    }
}
