package com.yazidmf.waktusholat.api;

import com.yazidmf.waktusholat.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();

}
