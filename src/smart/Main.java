public class Main {
  public static void main(String[] args) {
    SmartReferenceProxy proxy = new SmartReferenceProxy();

    // 模擬增加引用
    proxy.addReference();
    proxy.performOperation();

    // 模擬减少引用，直到資源被釋放
    proxy.removeReference();
    proxy.removeReference();

    // 在資源被釋放後，再次呼叫 performOperation() 會拋出例外
    proxy.performOperation();
  }
}