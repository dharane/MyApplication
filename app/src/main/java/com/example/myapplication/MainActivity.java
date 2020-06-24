package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    ViewFlipper viewFlipper;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int images[] = {R.drawable.ic_pickup_groceries,R.drawable.notifications,R.drawable.ic_pickup_groceries};
        viewFlipper = findViewById(R.id.flipper);
        for (int image:images){
            flipperImages(image);
        }
    }
    public void flipperImages(int image) {
        ImageView imageView = new ImageView( context);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(context,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(context,android.R.anim.slide_out_right);
    }
}