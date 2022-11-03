package main.Lesson14;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;
import java.util.Properties;

public class Accuweather {
//    static Properties prop = new Properties();

    public static void main(String[] args) throws IOException {
//        loadProperties();
        OkHttpClient client = new OkHttpClient();
//        http://dataservice.accuweather.com/forecasts/v1/daily/5day/
        HttpUrl url =new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("295212")
                .addQueryParameter("RTTjCCwptJxY4jGFMEi9xsUksGhApAPx")
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());

        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();
        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);


    }
}
