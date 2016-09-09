package br.com.fretebras.thalisson.login;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public interface LoginPresenter {
    void validateUser(String username, String password);
    void onDestroy();
}
