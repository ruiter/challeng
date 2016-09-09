package br.com.fretebras.thalisson.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import br.com.fretebras.thalisson.R;
import br.com.fretebras.thalisson.account.AccountActivity;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public class LoginActivity extends Activity implements LoginView, View.OnClickListener {
    private EditText username;
    private EditText password;
    private Button btnLogin;
    private LinearLayout progress;
    private LoginPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnValidateLogin);
        progress = (LinearLayout) findViewById(R.id.progress);

        btnLogin.setOnClickListener(this);

        presenter = new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        if (progress != null) {
            progress.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void hideProgress() {
        if (progress != null) {
            progress.setVisibility(View.GONE);
        }
    }

    @Override
    public void setUsernameError(String msg) {
        if (username != null) {
            username.setError(msg);
        }
    }

    @Override
    public void setPasswordError(String msg) {
        if (password != null) {
            password.setError(msg);
        }
    }

    @Override
    public void navigateToAccount() {
        startActivity(new Intent(this, AccountActivity.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        presenter.validateUser(username.getText().toString(), password.getText().toString());
    }
}
