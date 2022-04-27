package com.arun.taskkingslb2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {


    @GET("api/GetBranchs/6/79/463")
    Call<List<BankData>> getData();
}
