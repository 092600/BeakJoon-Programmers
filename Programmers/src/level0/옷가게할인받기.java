package level0;

public class 옷가게할인받기 {

    public static void main(String[] args) {
        int price = 150000;
        // int price = 464000;

        System.out.println(solution(0));
    }

    public static int solution(int price) {
        if (price < 100000) {
            return price;
        } else if (price < 300000) {
            return (int) (price * 0.95);
        } else if (price < 500000) {
            return (int) (price * 0.90);
        } else {
            return (int) (price * 0.80);
        }
    }
    
}
