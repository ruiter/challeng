package br.com.fretebras.thalisson.login;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError(String msg);
        void onPasswordError(String msg);
        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
