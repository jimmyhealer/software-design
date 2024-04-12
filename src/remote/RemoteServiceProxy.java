public class RemoteServiceProxy implements RemoteService {
  private ConcreteRemoteService remoteService;

  public RemoteServiceProxy() {
    this.remoteService = new ConcreteRemoteService();
  }

  @Override
  public String performRemoteOperation() {
    System.out.println("Proxying the request to the remote service...");
    String response;
    do {
      response = remoteService.performRemoteOperation();
    } while (response == null);
    return response;
  }
}