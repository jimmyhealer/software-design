public class RemoteServiceProxy implements RemoteService {
  private ConcreteRemoteService remoteService;

  public RemoteServiceProxy() {
    this.remoteService = new ConcreteRemoteService();
  }

  @Override
  public void performRemoteOperation() {
    System.out.println("Proxying the request to the remote service...");
    remoteService.performRemoteOperation();
  }
}