public class HeavyResource {
  public HeavyResource() {
    System.out.println("Creating Heavy Resource, which takes a lot of time and memory...");
    // 模擬長時間的建構過程
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void performOperation() {
    System.out.println("Performing operation on Heavy Resource");
  }
}
