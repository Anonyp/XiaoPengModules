### 支付宝支付对接


* 调用

```java
AliPay.Builder builder=new AliPay.Builder(MainActivity.this);
                    builder.setSELLER("商家账号");
                    builder.setRSA_PRIVATE(用户私钥);
                    builder.setPARTNER("PID");
                    builder.setNotifyURL("");
                    builder.setOrderTitle("测试商品");
                    builder.setSubTitle("测试商品详情-------------------------啦啦");
                    builder.setPrice("0.01");
                    builder.setPayCallBackListener(new AliPay.Builder.PayCallBackListener() {
                        @Override
                        public void onPayCallBack(int status, String resultStatus, String progress) {
                            Toast.makeText(MainActivity.this,progress,Toast.LENGTH_LONG).show();
                        }
                    });
                    builder.pay();
```


* 权限配置

```java
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />

```