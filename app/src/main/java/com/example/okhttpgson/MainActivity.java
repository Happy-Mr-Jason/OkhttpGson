package com.example.okhttpgson;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private final String LOTTORESULTSITE = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=";
    private EditText edtTime;
    private Button btnResult;
    private TextView tvResult;
    private final OkHttpClient okHttpClient = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTime = findViewById(R.id.edtTime);
        btnResult = findViewById(R.id.btnResult);
        tvResult = findViewById(R.id.tvResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    LottoData lottoDataResult = new MyAsyncTask().execute(LOTTORESULTSITE + edtTime.getText().toString()).get();
                    Log.d("Okhttp Result Activity", lottoDataResult.toString());
                    String result = lottoDataResult.getDrwNo() + "회차의 당첨 결과는 ";
                    result += lottoDataResult.getDrwtNo1() + " ";
                    result += lottoDataResult.getDrwtNo2() + " ";
                    result += lottoDataResult.getDrwtNo3() + " ";
                    result += lottoDataResult.getDrwtNo4() + " ";
                    result += lottoDataResult.getDrwtNo5() + " ";
                    result += lottoDataResult.getDrwtNo6() + " ";
                    result += " + " + lottoDataResult.getBnusNo() + " 입니다.";
                    tvResult.setText(result);
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

