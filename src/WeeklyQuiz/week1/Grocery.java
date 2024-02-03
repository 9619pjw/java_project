package WeeklyQuiz.week1;

public class Grocery extends Product implements DeliveryChargeCalculator{

    public Grocery(String name, int weight, int price) {
        super(name, weight, price);
    }
    @Override
    public int getDeliveryCharge(int weight, int price){
        return calculateDeliveryFee(weight, price);
    }
}
