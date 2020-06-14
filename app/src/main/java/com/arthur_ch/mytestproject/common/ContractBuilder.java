package com.arthur_ch.mytestproject.common;

import com.arthur_ch.mytestproject.model.LoginRepository;
import com.arthur_ch.mytestproject.presenter.LoginPresenter;

public class ContractBuilder {

    public static LoginContract.ILoginPresenter GetLoginPresenter(LoginContract.ILoginView _view)
    {
        return new LoginPresenter(_view, new LoginRepository());
    }
}
