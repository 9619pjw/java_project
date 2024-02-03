package WeeklyQuiz.week1;

public class Product {

    public String name;
    public int weight;
    public int price;

    // 생성자
    public Product(String name, int weight,int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

   public int calculateDeliveryFee(int weight, int price){
        if(price < 30000) {
            return calculateByWeight(weight);
        }
        else if(price >= 30000 && price < 100000){
            return calculateByWeight(weight)-1000;
        }else{
            return 0;
        }
   }

   public int calculateByWeight(int weight){
        if (weight < 3) {
            return 1000;
        }
        else if (weight >= 3 && weight < 10) {
            return 5000;
        }
        else{
            return 10000;
        }
   }
}
