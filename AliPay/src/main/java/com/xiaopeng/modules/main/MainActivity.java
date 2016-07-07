package com.xiaopeng.modules.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.xiaopeng.modules.R;


public class MainActivity extends AppCompatActivity {


    Button button;
    private String rsa_private="MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAJ+UA03zrlKS6CN4\n" +
            "cFrmxZv0uka96EBiew6jEPVZFr+4fuV7OsVbPYFnBswHA8JX9iDIfRPZzgjiyLpX\n" +
            "HWSZB9pNUOJkC5bOnsrYeRr2r0+VLqKvtOm2VsdbXn4bHyjYSdY5SRBXVQLJ+P5V\n" +
            "uJHtMco8+cKhIZqjquVYEdvPr/vxAgMBAAECgYBBxHzAKcgUnBs0UzTrIeUba3dC\n" +
            "JI6Nyoiw9Z/NnlPz3BPgfDMyl3H33QA+Ij34YMw9oqN6BPAXVXAo7DJe/XrwZO77\n" +
            "QZMPcOvAcjQ+1Mh9uttDQwxIZptYvPeZUpVMFsp39eF8hGx4CFrqO9zrxBl0exsZ\n" +
            "jkEuNj8P9JHtkBwK4QJBAND9aY00XPPGgNqOlkyjT6oVLvjCuSwNr1QeH7rJMNko\n" +
            "yg17fJ2aigovyfDFyJHvxJlh8pFHHFxOqTp2CMon4fUCQQDDeT/aNj4VDBoDyS8R\n" +
            "g8vfHB+pOeyTHxMifOlDyERGQ/UPfPQi4vnoOpzL2Wh2hiAO7PAHG5o+g8ZnGhuH\n" +
            "GWiNAkBsLtHl03ZOhrIK8Qaik2NYsvCGux3pzQe2boWURjNwJmo5gnPmjanpTgWm\n" +
            "CmwiB1Do6UgMphfrPJjjd1hjdTPFAkACCwlk0X5Sn/7BnV+1kigWW+fkz+suGnwL\n" +
            "tzyE7dnw1hMAp3Cx0KeGCt7KrqoN2xcIsOdNW7eAAcaYG0jAX76dAkAyhaZMuq4P\n" +
            "UDhsFbvpHb/nwp5Mx2fPXFl9WQHB05JjlLY9WpPZ5AKyKUc8ckKT41PKDcpD1xMS\n" +
            "jf6pK4HH+UMO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AliPay.Builder builder=new AliPay.Builder(MainActivity.this);
                builder.setSELLER("841462614@qq.com");
                builder.setRSA_PRIVATE(rsa_private);
                builder.setPARTNER("2088502872650920");
                builder.setNotifyURL("http://xiaopeng.wang");
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
            }
        });
    }
}
