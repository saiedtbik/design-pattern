package solution;

public class CalculationFacade {
    private BasePremiumCalculation basePremiumCalculation;
    private DiscountCalculation discountCalculation;
    private  TaxCalculation taxCalculation;

    public CalculationFacade(BasePremiumCalculation basePremiumCalculation, DiscountCalculation discountCalculation, TaxCalculation taxCalculation) {
        this.basePremiumCalculation = basePremiumCalculation;
        this.discountCalculation = discountCalculation;
        this.taxCalculation = taxCalculation;
    }

    public Object calculate(Object object){
    return  basePremiumCalculation.calculatePremium(object)
            - discountCalculation.calculateDiscount(object)
            + taxCalculation.calculateTax(object);
    }
}
