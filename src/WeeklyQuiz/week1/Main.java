package WeeklyQuiz.week1;

public class Main {
    public static void main(String[] args){

        Beauty beauty = new Beauty("Lipstick", 1, 10000);
        Grocery grocery = new Grocery("Rice", 5, 24000);
        LargeAppliance largeAppliance = new LargeAppliance("TV", 20, 200000);

        System.out.println("화장품 = " + beauty.name + " 배송비 : " + beauty.getDeliveryCharge(beauty.weight, beauty.price));
        System.out.println("풀때기 = " + grocery.name + " 배송비 : " + grocery.getDeliveryCharge(grocery.weight, grocery.price));
        System.out.println("가전 = " + largeAppliance.name + " 배송비 : " + largeAppliance.getDeliveryCharge(largeAppliance.weight, largeAppliance.price));
    }
}
