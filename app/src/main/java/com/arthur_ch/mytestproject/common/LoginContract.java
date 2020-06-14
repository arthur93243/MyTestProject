package com.arthur_ch.mytestproject.common;

public class LoginContract {

    /*** View <==> Presenter ****/
    // View -> Presenter
    public interface ILoginPresenter {
        void Login(String _account, String _password);
    }

    // Presenter -> View
    public interface ILoginView {
        void onLoginResult(boolean _result);
    }


    /*** Presenter <==> Model ****/
    // Presenter -> Model
    public interface ILoginModel {
        boolean GetLoginResult(String _account, String _password);
    }
}

