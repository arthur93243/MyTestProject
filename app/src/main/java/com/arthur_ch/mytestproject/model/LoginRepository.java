package com.arthur_ch.mytestproject.model;

import com.arthur_ch.mytestproject.common.LoginContract;

public class LoginRepository implements LoginContract.ILoginModel {
    @Override
    public boolean GetLoginResult(String _account, String _password)
    {
        //if (_account == "1111" && _password == "1111") return true;

        //return false;

        return true;
    }
}
