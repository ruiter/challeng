package br.com.fretebras.thalisson.account;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import br.com.fretebras.thalisson.R;
import br.com.fretebras.thalisson.databinding.ActivityAccountBinding;
import br.com.fretebras.thalisson.objects.User;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public class AccountActivity extends Activity implements AccountView {
    private ActivityAccountBinding binding;
    private AccountPresenterImpl accountPresenter;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_account);

        accountPresenter = new AccountPresenterImpl(this);
    }

    @Override
    public void setDataUser(User user) {
        if (binding != null) {
            binding.setUser(user);
        }
    }

    @Override
    public void errorRequest() {

    }

    @Override
    public void updateUser() {

    }
}