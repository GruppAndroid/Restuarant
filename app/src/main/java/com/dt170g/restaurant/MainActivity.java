package com.dt170g.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up button navigation
        Button buttonBooking = findViewById(R.id.button_booking);
        buttonBooking.setOnClickListener(v -> navigateTo(BookingActivity.class));

        Button buttonMoment1 = findViewById(R.id.button_moment1);
        buttonMoment1.setOnClickListener(v -> navigateTo(Moment1Activity.class));

        Button buttonMoment2 = findViewById(R.id.button_moment2);
        buttonMoment2.setOnClickListener(v -> navigateTo(Moment2Activity.class));

        Button buttonKitchen = findViewById(R.id.button_kitchen);
        buttonKitchen.setOnClickListener(v -> navigateTo(KitchenActivity.class));

        Button buttonCentral = findViewById(R.id.button_central);
        buttonCentral.setOnClickListener(v -> navigateTo(CentralActivity.class));
    }

    private void navigateTo(Class<?> destinationActivity) {
        Intent intent = new Intent(MainActivity.this, destinationActivity);
        startActivity(intent);
    }
}
