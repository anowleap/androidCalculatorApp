package com.example.leap.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LEApApp extends AppCompatActivity {

    private String currentVal = "0";
    private String previousVal = "0";
    private double ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leap_app);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_leap_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void foo(View view) {
        //android.util is unnecessary??
        //android.util.Log.v("MY_DEBUG_CODE", "You clicked!?");
       // TextView helloWorld = (TextView) findViewById(R.id.hello_world_text); //cast as object textview
       // helloWorld.setText("You clicked??");
    }

    public void hit0(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "0";
        }
        else {
            currentVal += "0";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit1(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "1";
        }
        else {
            currentVal += "1";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit2(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "2";
        }
        else {
            currentVal += "2";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit3(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "3";
        }
        else {
            currentVal += "3";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit4(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "4";
        }
        else {
            currentVal += "4";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit5(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "5";
        }
        else {
            currentVal += "5";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit6(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "6";
        }
        else {
            currentVal += "6";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit7(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "7";
        }
        else {
            currentVal += "7";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit8(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "8";
        }
        else {
            currentVal += "8";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hit9(View view) {

        if(currentVal.charAt(0) == '0' && currentVal.length() == 1) {
            currentVal = "9";
        }
        else {
            currentVal += "9";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hitDeci(View view) {

        boolean doit = true;
        for(int i = 0; i < currentVal.length(); i++) {

            if(currentVal.charAt(i) == '.') {
                doit = false;
            }
        }
        if(doit) {
            currentVal = currentVal + ".";
        }

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hitSign(View view) {

        if(currentVal.length() != 1 || currentVal.charAt(0) != '0') {
            double temp = -Double.parseDouble(currentVal);
            currentVal = temp + "";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hitCLR(View view) {

        currentVal = "0";
        previousVal = "0";
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hitPlus(View view) {

        previousVal = currentVal + "+";
        currentVal = "0";
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(previousVal.substring(0, previousVal.length() - 1));
    }

    public void hitMin(View view) {

        previousVal = currentVal + "-";
        currentVal = "0";
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(previousVal.substring(0, previousVal.length() - 1));
    }

    public void hitMult(View view) {

        previousVal = currentVal + "*";
        currentVal = "0";
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(previousVal.substring(0, previousVal.length() - 1));
    }

    public void hitDiv(View view) {

        previousVal = currentVal + "/";
        currentVal = "0";
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(previousVal.substring(0, previousVal.length() - 1));
    }

    public void hitRoot(View view) {
        double temp = Double.parseDouble(currentVal);
        if(temp > 0) {
            currentVal = Math.sqrt(temp) + "";
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }

    public void hitSquare(View view) {
        double temp = Double.parseDouble(currentVal);
        currentVal = (temp * temp) + "";
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }


    public void hitEqu(View view) {

        boolean calc = true;

        if(previousVal.charAt(previousVal.length() - 1) == '+'){

            ans = Double.parseDouble(currentVal) + Double.parseDouble(previousVal.substring(0,previousVal.length() - 1));
        }

        else if(previousVal.charAt(previousVal.length() - 1) == '-'){

            ans = Double.parseDouble(previousVal.substring(0,previousVal.length() - 1)) - Double.parseDouble(currentVal);
        }

        else if(previousVal.charAt(previousVal.length() - 1) == '*'){

            ans = Double.parseDouble(currentVal) * Double.parseDouble(previousVal.substring(0,previousVal.length() - 1));
        }

        else if(previousVal.charAt(previousVal.length() - 1) == '/') {

            ans = Double.parseDouble(previousVal.substring(0,previousVal.length() - 1)) / Double.parseDouble(currentVal);
        }
        else {
            calc = false;
        }

        if(calc) {
            previousVal = "0";
            currentVal = ans + "";
            ans = 0;
        }
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currentVal);
    }
}
