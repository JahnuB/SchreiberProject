package nothing.schreiberproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    globals g = globals.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkout (View v) {
        startActivity(new Intent(MainActivity.this, nothing.schreiberproject.Checkout_Page.class));
    }

    public void addToCart (View v) {
        TextView cartnumber = (TextView) findViewById(R.id.cartnumber);
        Integer number = Integer.parseInt(cartnumber.getText().toString());
        number++;
        cartnumber.setText(number.toString());

        DecimalFormat df = new DecimalFormat("#0.00");
        double price = Double.parseDouble(String.valueOf(v.getTag()));
        double subtotal = 0.00;
        subtotal = g.getST();
        subtotal = subtotal + price;
        g.setST(subtotal);
        Log.d("st: ", String.valueOf(subtotal));
    }

}
