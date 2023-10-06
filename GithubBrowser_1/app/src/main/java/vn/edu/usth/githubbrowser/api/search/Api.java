package vn.edu.usth.githubbrowser.api.search;

import vn.edu.usth.githubbrowser.data.UserResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    Call<UserResponse> getSearchUsers(
            @Query("q") String query
    );
}