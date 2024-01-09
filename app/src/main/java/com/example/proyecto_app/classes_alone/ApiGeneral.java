package com.example.proyecto_app.classes_alone;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public class ApiGeneral {
    static public String apiURL = "https://nodejs-api-99sp.onrender.com/api";
//    static public String apiURL = "http://localhost:3000/api";

    public interface AuthService {
        @POST("auth")
        Call<String> getLogin(
                @Query("usuario") String username,
                @Query("contrasena") String password
        );
    }

//    public RetrofitService makeRetrofitService(){
//        return  new Retrofit.Builder()
//                .baseUrl(apiURL)
//                .build().create(AuthService);
//    }
}
