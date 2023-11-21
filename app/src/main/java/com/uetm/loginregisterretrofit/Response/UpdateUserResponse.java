package com.uetm.loginregisterretrofit.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateUserResponse  {
    @SerializedName("response")
    @Expose()
    public UpdateBean updateBean;

    public UpdateBean getUpdateBean() {
        return updateBean;
    }
}
