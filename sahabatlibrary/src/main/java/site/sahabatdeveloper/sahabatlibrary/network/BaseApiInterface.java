package site.sahabatdeveloper.sahabatlibrary.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by sahabatdeveloper on 4/7/18.
 */

public interface BaseApiInterface {

    @POST("{route}")
    Call<ResponseBody> POST(@Body Object user, @Path("route") String route);

    @POST("{route}")
    Call<ResponseBody> POST(@Header("Authorization") String auth, @Body Object user, @Path("route") String route);

    @PUT("{route}")
    Call<ResponseBody> PUT(@Body Object user, @Path("route") String route, @Query("id") String id);

    @PUT("{route}")
    Call<ResponseBody> PUT(@Header("Authorization") String auth, @Body Object user, @Path("route") String route, @Query("id") String id);

    @DELETE("{route}")
    Call<ResponseBody> DELETE(@Path("route") String route, @Query("id") String id);

    @DELETE("{route}")
    Call<ResponseBody> DELETE(@Header("Authorization") String auth, @Path("route") String route, @Query("id") String id);

    @GET("{route}")
    Call<ResponseBody> GET(@Path("route") String route);

    @GET("{route}")
    Call<ResponseBody> GET(@Header("Authorization") String auth, @Path("route") String route);

}