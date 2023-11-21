package com.uetm.loginregisterretrofit.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginUserResponse {
    @SerializedName("response")
    @Expose()
    public LoginBean loginBean;

    public LoginBean getLoginresponse() {
        return loginBean;
    }
}
