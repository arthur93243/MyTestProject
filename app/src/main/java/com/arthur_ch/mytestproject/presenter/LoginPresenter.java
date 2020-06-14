package com.arthur_ch.mytestproject.presenter;

import com.arthur_ch.mytestproject.common.LoginContract;

public class LoginPresenter implements LoginContract.ILoginPresenter {

    LoginContract.ILoginView Contract;
    LoginContract.ILoginModel Repository;

    public LoginPresenter(LoginContract.ILoginView _contract, LoginContract.ILoginModel _repository)
    {
        this.Contract = _contract;
        this.Repository = _repository;
    }

    @Override
    public void Login(String _account, String _password)
    {
        if (!_account.isEmpty() && !_account.isEmpty())
        {
            //API
            if (Repository.GetLoginResult(_account, _password))
            {
                this.Contract.onLoginResult(true);
                return;
            }
        }

        this.Contract.onLoginResult(false);
    }
}
