public class Main {
  public static void main(String[] args) {
    RemoteService remoteServiceProxy = new RemoteServiceProxy();

    System.out.println("Requesting remote operation through proxy.");
    remoteServiceProxy.performRemoteOperation();
  }
}