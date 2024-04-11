public class Main {
  public static void main(String[] args) {
    HeavyResourceProxy proxy = new HeavyResourceProxy();

    System.out.println("HeavyResource not needed yet...");

    // 模擬一些操作
    try {
      Thread.sleep(1500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Now we need HeavyResource");
    proxy.performOperation(); // 這時才創建 HeavyResource
  }
}