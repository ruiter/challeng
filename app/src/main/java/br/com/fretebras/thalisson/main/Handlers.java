package br.com.fretebras.thalisson.main;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import br.com.fretebras.thalisson.login.LoginActivity;
import br.com.fretebras.thalisson.register.RegisterActivity;

/**
 * Created by Team Fretebras Android on 08/09/16.
 */
public class Handlers {
    public void onClickRegister(View view) {
        Context context = view.getContext();
        context.startActivity(new Intent(context, RegisterActivity.class));
    }

    public void onClickLogin(View view) {
        Context context = view.getContext();
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
