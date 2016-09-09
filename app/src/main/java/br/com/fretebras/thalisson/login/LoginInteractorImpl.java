package br.com.fretebras.thalisson.login;

import br.com.fretebras.thalisson.objects.Login;
import br.com.fretebras.thalisson.services.FretebrasService;
import br.com.fretebras.thalisson.services.ServiceFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        FretebrasService service = ServiceFactory.createRetrofitService(FretebrasService.class, FretebrasService.SERVICE_ENDPOINT);
        service.getLogin(username, password)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Login>() {
                    @Override
                    public void onCompleted() { }

                    @Override
                    public void onError(Throwable e) { }

                    @Override
                    public void onNext(Login login) {
                        if (login.getResult().equals("-1")) {
                            listener.onUsernameError(login.getMsg());
                        } else if (login.getResult().equals("-2")) {
                            listener.onPasswordError(login.getMsg());
                        } else if (login.getResult().equals("1")) {
                            listener.onSuccess();
                        }
                    }
                });
    }
}
