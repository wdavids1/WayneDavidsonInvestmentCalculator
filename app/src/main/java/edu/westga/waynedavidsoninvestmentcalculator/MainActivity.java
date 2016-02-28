package edu.westga.waynedavidsoninvestmentcalculator;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import android.widget.Toast;

import java.text.DecimalFormat;

import edu.westga.waynedavidsoninvestmentcalculator.model.InvestmentCalculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void calculateFutureValue(View view) {
        EditText paymentText = (EditText) findViewById(R.id.paymentEditText);
        EditText rateText = (EditText) findViewById(R.id.rateEditText);
        EditText periodText = (EditText) findViewById(R.id.periodEditText);

        try {
            Double payment = Double.parseDouble(paymentText.getText().toString());
            Double rate = Double.parseDouble(rateText.getText().toString());
            int period = Integer.parseInt(periodText.getText().toString());

            InvestmentCalculator calculator = new InvestmentCalculator(payment, rate, period);

            Double result = calculator.calculateFutureValue();

            TextView futureValue = (TextView) findViewById(R.id.calculatedTextView);

            DecimalFormat formattedResult = new DecimalFormat("$ #,###.00");

            futureValue.setText(formattedResult.format(result));
        } catch (NumberFormatException nfe) {
            Toast toast = Toast.makeText(getApplicationContext(), "Payment, Rate, and Period are required", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
