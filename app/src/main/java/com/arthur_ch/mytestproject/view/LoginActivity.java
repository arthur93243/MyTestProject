package com.arthur_ch.mytestproject.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.arthur_ch.mytestproject.R;
import com.arthur_ch.mytestproject.common.LoginContract;
import com.arthur_ch.mytestproject.model.LoginRepository;
import com.arthur_ch.mytestproject.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginContract.ILoginView {

    Button btn_login;
    TextView tv_account;
    TextView tv_password;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    public void init()
    {
        this.btn_login = (Button) findViewById(R.id.btn_Login);
        this.tv_account = (TextView) findViewById(R.id.tv_account);
        this.tv_password = (TextView) findViewById(R.id.tv_password);

        this.loginPresenter = new LoginPresenter(this, new LoginRepository());

        this.btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                loginPresenter.Login(tv_account.getText().toString(), tv_password.getText().toString());
            }
        });
    }

    @Override
    public void onLoginResult(boolean _result)
    {
        Toast toast = Toast.makeText(this, Boolean.toString(_result), Toast.LENGTH_LONG);
        toast.show();
    }
}