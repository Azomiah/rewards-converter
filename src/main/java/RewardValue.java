public class RewardValue {
    private static final double MILES_CONVERSION_RATE = 0.0035;
    private final double cashValue;
    private final double milesValue;

    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cashToMiles(cash);
    }

    public RewardValue(double miles, boolean isMiles) {
        this.milesValue = miles;
        this.cashValue = milesToCash(miles);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double cashToMiles(double cash) {
        return cash / MILES_CONVERSION_RATE;
    }

    private double milesToCash(double miles) {
        return miles * MILES_CONVERSION_RATE;
    }
}
