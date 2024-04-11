public class ManagedResource {
  public ManagedResource() {
    System.out.println("ManagedResource created.");
  }

  public void performOperation() {
    System.out.println("Performing operation on ManagedResource.");
  }

  public void finalize() {
    System.out.println("ManagedResource finalized and resources released.");
  }
}