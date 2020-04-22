package com.dev_m_elbanna.watsonbot.network;

import com.dev_m_elbanna.watsonbot.network.pojo.WatsonRequest;
import com.dev_m_elbanna.watsonbot.network.pojo.WatsonResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created By Mohamed El Banna On 4/3/2020
 **/

public interface WatsonService {
    @Headers("Content-Type: application/json")
    @POST("message")
    Call<WatsonResponse> getBotReplay(@Header("Authorization") String api_key, @Query("version")
            String version, @Body WatsonRequest mRequest);
}
