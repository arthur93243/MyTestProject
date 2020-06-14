package com.arthur_ch.mytestproject.model;

import com.arthur_ch.mytestproject.common.LoginContract;

public class LoginRepository implements LoginContract.ILoginModel {
    @Override
    public boolean GetLoginResult(String _account, String _password)
    {
        if (_account.equals("1111") && _password.equals("1111")) return true;

        return false;
    }
}
