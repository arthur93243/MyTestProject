package com.arthur_ch.mytestproject.presenter;

import com.arthur_ch.mytestproject.common.LoginContract;

public class LoginTestPresenter implements LoginContract.ILoginPresenter {

    LoginContract.ILoginView View;
    LoginContract.ILoginModel Repository;

    public LoginTestPresenter(LoginContract.ILoginView _contract, LoginContract.ILoginModel _repository)
    {
        this.View = _contract;
        this.Repository = _repository;
    }

    @Override
    public void Login(String _account, String _password)
    {
        if (!_account.isEmpty() && !_password.isEmpty())
        {
            //Test
            if (_account.equals("1111") && _password.equals("1111"))
            {
                this.View.onLoginResult(true);
                return;
            }
        }

        this.View.onLoginResult(false);
    }
}
