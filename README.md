# 軟體設計 Proxy Pattern

此專案展示了 Proxy Pattern 在軟體設計中的應用，通過多種類型的代理模式實作，提供了一系列解決不同設計問題的策略。

## PPT 報告

[https://docs.google.com/presentation/d/1LYkl6XeqZLH0wUsCKGfaQBd2gqiKeBVBhX6Ky-0f1Bg/edit?usp=sharing](https://docs.google.com/presentation/d/1LYkl6XeqZLH0wUsCKGfaQBd2gqiKeBVBhX6Ky-0f1Bg/edit?usp=sharing)

## 類型與應用

### Lazy Initialization (Virtual Proxy)
- **功能說明：** 物件的初始化延遲到真正需要的時間點，避免在應用程式啟動時進行重量級的物件建立。

### Access Control (Protection Proxy)
- **功能說明：** 根據客戶端的憑證或請求條件，決定是否將請求傳遞給服務物件，實現訪問控制。

### Local Execution of a Remote Service (Remote Proxy)
- **功能說明：** 為遠端服務提供本地執行的接口，代理處理網路通信和數據轉換等繁瑣細節。

### Logging Requests (Logging Proxy)
- **功能說明：** 在將請求傳遞給服務物件之前，記錄每個請求的資訊，用於調試或審計。

### Caching Request Results (Caching Proxy)
- **功能說明：** 對服務請求的結果進行緩存，當發生重複的請求時，直接從緩存中返回結果，提高系統效率。

### Smart Reference
- **功能說明：** 當沒有客戶端使用某個資源時，自動釋放該資源，有效管理系統資源。

## Usage

使用 Makefile 進行編譯執行

```bash
make (all|clean|run|run-lazy|run-access|run-remote|run-logging|run-caching|run-smart)
```

## 環境要求

本專案需要 Java 環境進行編譯和執行，要求：

- OpenJDK 版本 "1.8.0_292" 以上