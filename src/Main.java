public class Main {
  public static void main(String[] args) {
    BmiService service = new BmiService();
    double index = service.calculate(90, 187);
    System.out.printf("Индекс массы тела: "+ "%.2f", index);
  }

}