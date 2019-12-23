package com.example.projetmobile4a.views.View.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projetmobile4a.R;
import com.example.projetmobile4a.views.View.model.Beer;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

  private ImageView imgBeer;
  private TextView titrel;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.detail_activity);

    //imgBeer = findViewById(R.id.img_beer);
    titrel = findViewById(R.id.titre);

    titrel.setText(getIntent().getStringExtra("EXTRA_SESSION_ID"));

    /*String chienJson = getIntent().getStringExtra("CLE");
    Gson gson = new Gson();
    Beer beer = gson.fromJson(chienJson, Beer.class);
    Picasso.with(getBaseContext())
      .load(beer.getImage_url())
      .into(imgBeer);  */
  }

}
