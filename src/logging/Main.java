public class Main {
  public static void main(String[] args) {
    ServiceInterface service = new LoggingProxy();
    service.performOperation();
  }
}
