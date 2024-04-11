public class AccessControlProxy implements ResourceOperation {
  private ConcreteResource concreteResource;
  private boolean hasAccess;

  public AccessControlProxy(boolean hasAccess) {
    this.hasAccess = hasAccess;
    this.concreteResource = new ConcreteResource();
  }

  @Override
  public void performOperation() {
    if (hasAccess) {
      concreteResource.performOperation();
    } else {
      System.out.println("Access Denied: You do not have permission to perform this operation.");
    }
  }
}