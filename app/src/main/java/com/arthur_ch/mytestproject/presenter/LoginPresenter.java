package com.arthur_ch.mytestproject.presenter;

import com.arthur_ch.mytestproject.common.LoginContract;

public class LoginPresenter implements LoginContract.ILoginPresenter {

    LoginContract.ILoginView View;
    LoginContract.ILoginModel Repository;

    public LoginPresenter(LoginContract.ILoginView _contract, LoginContract.ILoginModel _repository)
    {
        this.View = _contract;
        this.Repository = _repository;
    }

    @Override
    public void Login(String _account, String _password)
    {
        boolean res = Repository.GetLoginResult(_account, _password);

        this.View.onLoginResult(res);
    }
}
