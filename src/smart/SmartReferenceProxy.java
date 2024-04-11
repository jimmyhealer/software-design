public class SmartReferenceProxy {
  private ManagedResource resource;
  private int referenceCount;

  public SmartReferenceProxy() {
    this.resource = new ManagedResource();
    this.referenceCount = 1; // 初始創建時計數器為 1
  }

  public void addReference() {
    referenceCount++;
    System.out.println("Reference added. Current count: " + referenceCount);
  }

  public void removeReference() {
    referenceCount--;
    System.out.println("Reference removed. Current count: " + referenceCount);
    if (referenceCount == 0) {
      resource.finalize(); // 在沒有任何引用時釋放資源
      resource = null; // 幫助垃圾收集器回收
    }
  }

  public void performOperation() {
    if (resource != null) {
      resource.performOperation();
    } else {
      System.out.println("Cannot perform operation. Resource has been released.");
    }
  }
}