public class ConcreteRemoteService implements RemoteService {
  @Override
  public void performRemoteOperation() {
    System.out.println("Performing operation in the remote service.");
    // 模擬遠程操作的延時
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Remote operation completed.");
  }
}