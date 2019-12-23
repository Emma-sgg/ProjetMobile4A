/*package com.example.projetmobile4a.views.View.controler;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.projetmobile4a.views.View.model.Beer;
import com.example.projetmobile4a.views.View.view.MainActivity;
import com.example.projetmobile4a.views.View.view.MyAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class controller {

  private RecyclerView recyclerView;
  private RecyclerView.Adapter mAdapter;
  private RecyclerView.LayoutManager layoutManager;
  private TextView textViewResult;

  private MainActivity activity;

  public Controller(MainActivity mainActivity) {
    this.activity = mainActivity;
  }

  public void start() {
    Gson gson = new GsonBuilder()
      .setLenient()
      .create();

    Retrofit retrofit = new Retrofit.Builder() //création du retrofit
      .baseUrl("https://api.punkapi.com/v2/")
      .addConverterFactory(GsonConverterFactory.create())
      .build();

    JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
    Call<List<Beer>> call = jsonPlaceHolderApi.getListBeer();

    public void showList(List<Beer> beerList){
      recyclerView.setHasFixedSize(true);
      // use a linear layout manager
      layoutManager = new LinearLayoutManager(this);
      recyclerView.setLayoutManager(layoutManager);
        /*for (int i = 0; i < 100; i++) {
            input.add("Test" + i);
        }// define an adapter*/

     /* mAdapter = new MyAdapter(beerList);
      recyclerView.setAdapter(mAdapter);

    }

    call.enqueue(new Callback<List<Beer>>() {

      @Override
      public void onResponse(Callback<List<Beer>> call, Callback<List<Beer>> response) {
        if (response.isSuccessful()) {
          List<Beer> beers = response.body();
          showList(beers);
        }
        else{
          textViewResult.setText("Code" + response.code());
          return;
        }
        @Override
        public void onFailure(Call<List<Beer>> call, Throwable t) {
          textViewResult.setText(t.getMessage());
        }


    });

}
*/
