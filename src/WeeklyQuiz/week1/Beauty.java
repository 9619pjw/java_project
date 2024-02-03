package WeeklyQuiz.week1;

public class Beauty extends Product implements DeliveryChargeCalculator{

    public Beauty(String name, int weight, int price) {
        super(name, weight, price);
    }

    @Override
    public int getDeliveryCharge(int weight, int price){
        return calculateDeliveryFee(weight, price);
    }
}
