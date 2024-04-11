public class RealDataProvider implements DataProviderInterface {
  @Override
  public String fetchData() {
    // 模擬耗時操作
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    return "Fetched data";
  }
}