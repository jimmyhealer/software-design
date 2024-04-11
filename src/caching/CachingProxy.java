import java.util.Optional;

public class CachingProxy implements DataProviderInterface {
  private RealDataProvider realDataProvider;
  private Optional<String> cachedData = Optional.empty();

  public CachingProxy() {
    this.realDataProvider = new RealDataProvider();
  }

  @Override
  public String fetchData() {
    // 如果快取中有資料，直接返回快取的結果
    if (cachedData.isPresent()) {
      System.out.println("Returning cached data.");
      return cachedData.get();
    }

    // 否則，調用真實服務，並將結果緩存起來
    String data = realDataProvider.fetchData();
    cachedData = Optional.of(data);
    System.out.println("Fetching new data and caching it.");
    return data;
  }
}