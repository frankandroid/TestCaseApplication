package com.example.frank.test;

/**
 * 创建者     frank
 * 创建时间   2017/6/13 22:36
 * 描述	      ${TODO}
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */

public class LoginPresenter {

    public static final String TAG = "LoginPresenter";

    private UserManager       mUserManager       = new UserManager();
    private PasswordValidator mPasswordValidator = new PasswordValidator();
    private NetWorkCallBack mNetWorkCallBack = new NetWorkCallBack() {
        @Override
        public void onSuccess(Object data) {

        }

        @Override
        public void onFailure(int code, String msg) {

        }
    };

    public void login(String username, String password) {
        if (username == null || username.length() == 0)
            return;
        if (password == null || password.length() < 6)
            return;

        if (mPasswordValidator.verifyPassword(password))
            return;

        mUserManager.performLogin(username, password, mNetWorkCallBack);
    }

    public UserManager getUserManager() {
        return mUserManager;
    }

    public void setUserManager(UserManager userManager) {
        mUserManager = userManager;
    }

    public PasswordValidator getPasswordValidator() {
        return mPasswordValidator;
    }

    public void setPasswordValidator(PasswordValidator passwordValidator) {
        mPasswordValidator = passwordValidator;
    }

    public NetWorkCallBack getNetWorkCallBack() {
        return mNetWorkCallBack;
    }

    public void setNetWorkCallBack(NetWorkCallBack netWorkCallBack) {
        mNetWorkCallBack = netWorkCallBack;
    }
}
