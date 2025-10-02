public class Bottles {
  public static void main(String[] args) {
    System.out.println(numWaterBottles(15, 4));
  }

  public static int numWaterBottles(int numBottles, int numExchange) {
    int drank = numBottles;
    int empty = numBottles;

    while (empty >= numExchange) {
      int newBottles = empty / numExchange;
      drank += newBottles;
      empty = empty % numExchange + newBottles;
    }
    return drank;
  }
}
