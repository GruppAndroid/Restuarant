package com.dt170g.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Moment1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moment1);

        // Sätt upp toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Hämta inputfält och knapp
        EditText orderInput = findViewById(R.id.order_input);
        Button sendOrderButton = findViewById(R.id.button_send_order);

        // Skicka beställningen till KitchenActivity
        sendOrderButton.setOnClickListener(v -> {
            String orderData = orderInput.getText().toString();
            Intent intent = new Intent(Moment1Activity.this, KitchenActivity.class);
            intent.putExtra("order_data", orderData);
            startActivity(intent);
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
