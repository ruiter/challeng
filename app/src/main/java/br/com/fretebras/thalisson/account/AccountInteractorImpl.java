package br.com.fretebras.thalisson.account;

import br.com.fretebras.thalisson.objects.Status;
import br.com.fretebras.thalisson.objects.User;
import br.com.fretebras.thalisson.services.FretebrasService;
import br.com.fretebras.thalisson.services.ServiceFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Team Fretebras Android on 09/09/16.
 */
public class AccountInteractorImpl implements AccountInteractor {
    private FretebrasService service;

    @Override
    public void requestDataUser(String idUser, final OnLoadDataFishListener listen) {
        service = ServiceFactory.createRetrofitService(FretebrasService.class, FretebrasService.SERVICE_ENDPOINT);
        service.getUser(idUser)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<User>() {
                    @Override
                    public void onCompleted() { }

                    @Override
                    public void onError(Throwable e) { }

                    @Override
                    public void onNext(User user) {
                        listen.onSuccess();
                    }
                });
    }

    @Override
    public void saveDataUser(String name, String mail, String likeCoffe, final OnLoadDataFishListener listen) {
        service = ServiceFactory.createRetrofitService(FretebrasService.class, FretebrasService.SERVICE_ENDPOINT);
        service.userUpdate(name, mail, likeCoffe)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Status>() {
                    @Override
                    public void onCompleted() { }

                    @Override
                    public void onError(Throwable e) { }

                    @Override
                    public void onNext(Status status) {
                        if (status.getStatus().equals("1")) {
                            listen.onSuccess();
                        } else {
                            listen.onErrorRequestData();
                        }
                    }
                });
    }
}
