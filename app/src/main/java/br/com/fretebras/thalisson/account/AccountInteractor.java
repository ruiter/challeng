package br.com.fretebras.thalisson.account;

/**
 * Created by Team Fretebras Android on 09/09/16.
 */
public interface AccountInteractor {
    interface OnLoadDataFishListener {
        void onErrorRequestData();
        void onSuccess();
    }
    void requestDataUser(String idUser, OnLoadDataFishListener listen);
    void saveDataUser(String name, String mail, String likeCoffe, OnLoadDataFishListener listen);
}
