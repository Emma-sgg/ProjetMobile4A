package com.example.projetmobile4a.views.View.controler;

import com.example.projetmobile4a.views.View.model.Beer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
  @GET("beers")
  Call<List<Beer>> getListBeer();
}
