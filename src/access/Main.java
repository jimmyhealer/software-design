public class Main {
  public static void main(String[] args) {
    ResourceOperation allowedAccessProxy = new AccessControlProxy(true);
    ResourceOperation deniedAccessProxy = new AccessControlProxy(false);

    System.out.println("Trying to perform operation with access:");
    allowedAccessProxy.performOperation();

    System.out.println("\nTrying to perform operation without access:");
    deniedAccessProxy.performOperation();
  }
}