package nothing.schreiberproject;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class globals{
    private static globals instance;

    // Global variable
    private double data;

    // Restrict the constructor from being instantiated
    private globals(){}

    public void setST(double d){
        this.data=d;
    }
    public double getST(){
        return this.data;
    }

    public static synchronized globals getInstance(){
        if(instance==null){
            instance=new globals();
        }
        return instance;
    }
}
