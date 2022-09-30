package com.laioffer.tinnews.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// chrome
// chrome client -> url -> http -> networking call -> html -> render -> website
// 任何地方的networking都是通过http实现
// RetrofitClient -> url -> okhttp -> networking call -> json -> parse -> java class
public class RetrofitClient {

    // TODO: Assign your API_KEY here
    private static final String API_KEY = "c46e727a7a7b4fe6bd25044212c23176";
    private static final String BASE_URL = "https://newsapi.org/v2/";

    public static Retrofit newInstance() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HeaderInterceptor())
                .build();
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) // json -> java class
                .client(okHttpClient)
                .build();
    }
    private static class HeaderInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request original = chain.request();
            Request request = original
                    .newBuilder()
                    .header("X-Api-Key", API_KEY)
                    .build();
            return chain.proceed(request);
        }
    }

}


