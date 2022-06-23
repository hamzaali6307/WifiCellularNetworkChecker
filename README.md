# WifiCellularNetworkChecker
WifiCellularNetworkChecker Library work on checking wifi / Cellular / EtherCable for network.
it return true if  wifi / Cellular / EtherCable is connected other wise false.

Why I created this:-
as most of applications we developed need wifi checking before hitting application to some network call and we need to setup code each time for wifi or cellular
network to perform action in application. To avoid this we can use this library as just simple import and use 1 line to check wifi or cellular network is available 
or not to performed action task

**Use this lib: **

  implementation 'com.github.hamzaali6307:WifiCellularNetworkChecker:1.0.0'
  
**Use:**

  HWifiChecker.hasInternetConnected(getApplication()) return true 





