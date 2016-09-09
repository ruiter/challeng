package br.com.fretebras.thalisson.services;

import retrofit.RestAdapter;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public class ServiceFactory {
    public static <T> T createRetrofitService(final Class<T> clazz, final String endPoint) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(endPoint)
                .build();
        T service = restAdapter.create(clazz);

        return service;
    }
}
