package edu.westga.waynedavidsoninvestmentcalculator;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Wayne on 2/27/2016.
 */
public class MainActivityTests extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTests() {
        super(MainActivity.class);
    }

    public void testActivityExists() {
        MainActivity activity = getActivity();
        assertNotNull(activity);
    }

    public void testPayment() {
        MainActivity activity = getActivity();

        final EditText paymentEditText = (EditText) activity.findViewById(R.id.paymentEditText);

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                paymentEditText.requestFocus();
            }
        });

        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync("100");
    }

    public void testRate() {
        MainActivity activity = getActivity();

        final EditText rateEditText = (EditText) activity.findViewById(R.id.rateEditText);

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                rateEditText.requestFocus();
            }
        });

        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync("5");
    }

    public void testPeriod() {
        MainActivity activity = getActivity();

        final EditText periodEditText = (EditText) activity.findViewById(R.id.periodEditText);

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                periodEditText.requestFocus();
            }
        });

        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync("10");
    }

    public void testCalculate() {
        MainActivity activity = getActivity();

        this.testPayment();
        this.testRate();
        this.testPeriod();

        Button calculateButton = (Button) activity.findViewById(R.id.calculateButton);

        TouchUtils.clickView(this, calculateButton);
    }
}
