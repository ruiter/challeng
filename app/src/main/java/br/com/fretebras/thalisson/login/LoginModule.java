package br.com.fretebras.thalisson.login;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Team Fretebras Android on 07/10/16.
 */

@Module
public class LoginModule {
    private LoginView view;

    public LoginModule(LoginView view) {
        this.view = view;
    }

    @Provides
    @Singleton
    public LoginView provideView() {
        return view;
    }

    @Provides
    @Singleton
    public LoginPresenter providePresenter(LoginView loginView, LoginInteractor loginInteractor) {
        return new LoginPresenterImpl(loginView, loginInteractor);
    }
}
