package nothing.schreiberproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
import java.text.DecimalFormat;

public class Checkout_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Checkout");

        setContentView(R.layout.activity_checkout__page);
        globals g = globals.getInstance();
        double subtotal = g.getST();
        DecimalFormat df = new DecimalFormat("#.##");
        String st = String.valueOf(subtotal);
        //String st = (df.format(subtotal).toString());
        Log.d("st2: ", String.valueOf(subtotal));
        TextView tv = (TextView)findViewById(R.id.subtotal_tv);
        tv.setText(st);

        double tax = subtotal * 0.04;
        TextView taxView = (TextView)findViewById(R.id.tax_tv);
        taxView.setText(String.valueOf(tax));

        double total = subtotal + tax;
        TextView totalView = (TextView) findViewById(R.id.total_tv);
        totalView.setText(String.valueOf(total));
    }

    public void gps (View v) {
        startActivity(new Intent(Checkout_Page.this, nothing.schreiberproject.gpsMAP.class));
    }

}
