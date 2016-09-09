package br.com.fretebras.thalisson.login;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public interface LoginView {
    void showProgress();
    void hideProgress();
    void setUsernameError(String msg);
    void setPasswordError(String msg);
    void navigateToAccount();
}
