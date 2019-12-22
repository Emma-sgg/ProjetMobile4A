package com.example.projetmobile4a.views.View.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projetmobile4a.R;
import com.example.projetmobile4a.views.View.view.Activity2;

public class  MainActivity extends AppCompatActivity {

  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    button = (Button)findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener(){
      public void onClick(View v){
        openActivity2();
      }
    });
  }

  public void openActivity2(){
    Intent intent = new Intent(this, Activity2.class);
    startActivity(intent);
  }
}
