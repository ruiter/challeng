package br.com.fretebras.thalisson.account;

/**
 * Created by Team Fretebras Android on 09/09/16.
 */
public interface AccountPresenter {
    void select(String idUser);
    void update(String name, String mail, String likeCoffe);
    void onDestroy();
}
