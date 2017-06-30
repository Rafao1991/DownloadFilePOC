package com.example.rcsva.downloadfilepoc;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

public interface API {

    @Streaming
    @GET("files/Node-Android-Chat.zip")
    Call<ResponseBody> download();
}
