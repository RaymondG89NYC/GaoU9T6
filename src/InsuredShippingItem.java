public class InsuredShippingItem extends ShippingItem {
  private double insuredAmount;
  
  public InsuredShippingItem(double w, double insAmt) {
    super(w);
    insuredAmount = insAmt;
  }

  @Override
  public double getCost() {
    double cost = super.getCost();
    return cost + insuredAmount;
  }
  
  public void addMoreInsurance(double amt) {
    insuredAmount += amt;
  }
}