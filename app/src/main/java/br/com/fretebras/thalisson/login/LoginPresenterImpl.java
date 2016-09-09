package br.com.fretebras.thalisson.login;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor =  new LoginInteractorImpl();
    }

    @Override
    public void validateUser(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }

        loginInteractor.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUsernameError(String msg) {
        if (loginView != null) {
            loginView.setUsernameError(msg);
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError(String msg) {
        if (loginView != null) {
            loginView.setPasswordError(msg);
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.hideProgress();
            loginView.navigateToAccount();
        }
    }
}
