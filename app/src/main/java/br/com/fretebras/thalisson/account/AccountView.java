package br.com.fretebras.thalisson.account;

import br.com.fretebras.thalisson.objects.User;

/**
 * Created by Team Fretebras Android on 09/09/16.
 */
public interface AccountView {
    void setDataUser(User user);
    void updateUser();
    void errorRequest();
}
