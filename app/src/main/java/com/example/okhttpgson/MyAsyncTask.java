package com.example.okhttpgson;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MyAsyncTask extends AsyncTask<String, Void, LottoData> {

    OkHttpClient client = new OkHttpClient();
    private LottoData lottoData;

    @Override
    protected LottoData doInBackground(String... strings) {
        String url = strings[0];
        try {
            Log.d("Okhttp Param0", url);
            Request request = new Request.Builder().url(url).build();
            Response response = client.newCall(request).execute();
            String result = response.body().string();
            Log.d("Okhttp Response String", result);
            Gson gson = new Gson();
            Type dataType = new TypeToken<LottoData>(){}.getType();
            lottoData = gson.fromJson(result,dataType);
            Log.d("Okhttp Task Response", lottoData.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lottoData;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(LottoData list) {
        super.onPostExecute(list);
    }
}
