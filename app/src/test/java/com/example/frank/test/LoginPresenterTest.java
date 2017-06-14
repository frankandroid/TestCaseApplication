package com.example.frank.test;


import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

/**
 * 创建者     frank
 * 创建时间   2017/6/13 22:38
 * 描述	      ${TODO}
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */

public class LoginPresenterTest {

    @Test
    public void TestLogin() throws Exception {

        UserManager usermanager = Mockito.mock(UserManager.class);
        PasswordValidator validator = Mockito.mock(PasswordValidator.class);
        NetWorkCallBack callback = Mockito.mock(NetWorkCallBack.class);

        final LoginPresenter presenter = new LoginPresenter();
        presenter.setUserManager(usermanager);
        presenter.setPasswordValidator(validator);
        presenter.setNetWorkCallBack(callback);

        presenter.login("xiaochuang", "xiaochuang password");

        Mockito.verify(usermanager).performLogin("xiaochuang", "xiaochuang password",callback);
        Mockito.when(validator.verifyPassword(anyString())).thenReturn(false);

        Mockito.doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {

                Object[] arguments = invocation.getArguments();
                NetWorkCallBack callback = (NetWorkCallBack) arguments[2];
                callback.onFailure(500, "Server error");
                return 500;
            }
        }).when(usermanager).performLogin(anyString(),anyString(),any(NetWorkCallBack.class));


        //Mockito.verify(callback).onFailure(anyInt(), anyString());




    }

}
