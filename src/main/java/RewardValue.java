public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }
    public RewardValue(double milesValue, boolean isMiles){
        if(isMiles){
            this.milesValue = milesValue;
            this.cashValue = milesValue*MILES_TO_CASH_CONVERSION_RATE;
        } else {
            this.cashValue = milesValue;
            this.milesValue = milesValue / MILES_TO_CASH_CONVERSION_RATE;
        }
    }

    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue reward1 = new RewardValue(100.0);
        System.out.println("Cash Value: " + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue());

        RewardValue reward2 = new RewardValue(2000.0, true);
        System.out.println("Cash Value: " + reward2.getMilesValue());
        System.out.println("Miles Value: " + reward2.getCashValue());
    }
}
