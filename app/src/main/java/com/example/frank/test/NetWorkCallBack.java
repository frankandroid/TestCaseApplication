package com.example.frank.test;

/**
 * 创建者     frank
 * 创建时间   2017/6/13 23:16
 * 描述	      ${TODO}
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */

public interface NetWorkCallBack {

    void onSuccess(Object data);

    void onFailure(int code, String msg);

}
