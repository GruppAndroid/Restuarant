package com.dt170g.restaurant;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class KitchenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Ta emot orderdata och visa det
        String orderData = getIntent().getStringExtra("order_data");
        TextView orderTextView = findViewById(R.id.order_text);
        orderTextView.setText("Inkommande beställning: " + orderData);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
