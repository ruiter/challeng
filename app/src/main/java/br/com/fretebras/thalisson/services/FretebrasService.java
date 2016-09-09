package br.com.fretebras.thalisson.services;

import br.com.fretebras.thalisson.objects.Login;
import br.com.fretebras.thalisson.objects.Status;
import br.com.fretebras.thalisson.objects.User;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public interface FretebrasService {
    String SERVICE_ENDPOINT = "http://192.168.1.181/desafio";

    @GET("/login/")
    Observable<Login> getLogin(
            @Query("username") String username,
            @Query("password") String password);

    @GET("/user/")
    Observable<User> getUser(
            @Query("id") String id);

    @GET("/update/")
    Observable<Status> userUpdate(
            @Query("name") String name,
            @Query("mail") String mail,
            @Query("likeCoffe") String likeCoffe);
}
