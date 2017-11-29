package nothing.schreiberproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Checkout_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Checkout");
        Button button = (Button) findViewById(R.id.purchase);
        setContentView(R.layout.activity_checkout__page);
//        button.setOnClickListener( new View.OnClickListener()
//        {
//            public void onClick (View v){
//                startActivity(new Intent(Checkout_Page.this, gpsMAP.class));
//            }
//        });
    }
}
