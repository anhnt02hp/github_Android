package vn.edu.usth.githubbrowser.api.search;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL = "https://api.github.com/";
    private static Retrofit retrofit;
    private static Api apiInstance;

    private RetrofitClient() { }

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Api getApiInstance() {
        if (apiInstance == null) {
            apiInstance = getRetrofit().create(Api.class);
        }
        return apiInstance;
    }
}
