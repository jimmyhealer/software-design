public class HeavyResourceProxy {
  private HeavyResource heavyResource;

  public void performOperation() {
    if (heavyResource == null) {
      heavyResource = new HeavyResource(); // Lazy Initialization
    }
    heavyResource.performOperation();
  }
}