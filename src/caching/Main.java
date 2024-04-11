public class Main {
  public static void main(String[] args) {
    DataProviderInterface dataProvider = new CachingProxy();

    System.out.println(dataProvider.fetchData());

    System.out.println(dataProvider.fetchData());
  }
}