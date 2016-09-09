package br.com.fretebras.thalisson.account;

/**
 * Created by Team Fretebras Android on 09/09/16.
 */
public class AccountPresenterImpl implements AccountPresenter, AccountInteractor.OnLoadDataFishListener {
    private AccountInteractor accountInteractor;
    private AccountView accountView;

    public AccountPresenterImpl(AccountView accountView) {
        this.accountView = accountView;
        this.accountInteractor = new AccountInteractorImpl();
    }

    @Override
    public void select(String idUser) {
        accountInteractor.requestDataUser(idUser, this);
    }

    @Override
    public void update(String name, String mail, String likeCoffe) {
        accountInteractor.saveDataUser(name, mail, likeCoffe, this);
    }

    @Override
    public void onDestroy() {
        accountView = null;
    }

    @Override
    public void onErrorRequestData() {

    }

    @Override
    public void onSuccess() {

    }
}
