import java.time.LocalDateTime;

public class LoggingProxy implements ServiceInterface {
  private RealService realService;

  public LoggingProxy() {
    this.realService = new RealService();
  }

  @Override
  public void performOperation() {
    log("Operation started at " + LocalDateTime.now());
    realService.performOperation();
    log("Operation finished at " + LocalDateTime.now());
  }

  private void log(String message) {
    System.out.println("Log: " + message);
  }
}