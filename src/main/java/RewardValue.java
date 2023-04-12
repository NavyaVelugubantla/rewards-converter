public class RewardValue {

    private double cashValue;
    private double  milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * 0.0035;
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }
}
