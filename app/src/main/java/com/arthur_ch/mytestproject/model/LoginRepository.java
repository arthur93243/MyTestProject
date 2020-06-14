package com.arthur_ch.mytestproject.model;

import com.arthur_ch.mytestproject.common.LoginContract;

public class LoginRepository implements LoginContract.ILoginModel {

    TKRepository tkRepository;

    @Override
    public boolean GetLoginResult(String _account, String _password)
    {
        boolean result = true;

        /***Business layer***/
        if (_account.isEmpty() || _password.isEmpty()) return false;

        /**Data Layer***/
        //for test
        if (_account.equals("1111") && _password.equals("2222")) result = true;

        //call API
        result &= tkRepository.getLogin(_account, _password);

        return result;
    }
}
