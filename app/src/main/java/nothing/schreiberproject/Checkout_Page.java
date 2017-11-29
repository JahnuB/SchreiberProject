package nothing.schreiberproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

public class Checkout_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Checkout");

        setContentView(R.layout.activity_checkout__page);

        globals g = globals.getInstance();
        Log.d("price:", String.valueOf(g.getST()));
        Integer subtotal = g.getST();
        String st = String.valueOf(subtotal);
        TextView tv = (TextView)findViewById(R.id.subtotal_tv);
        tv.setText(st);
    }

    public void gps (View v) {
        startActivity(new Intent(Checkout_Page.this, nothing.schreiberproject.gpsMAP.class));
    }

}
