package com.example.prasanth.states_learning;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class SavingStatesActivity extends Activity {

 String msg="HELLO";


    @Override
    protected void onCreate(Bundle onSavedInstanceState) {
        super.onCreate(onSavedInstanceState);
        setContentView(R.layout.states_activity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart() called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume() called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause() called",Toast.LENGTH_SHORT).show();
    }

    protected void onStop()
    {
        super.onPause();
        Toast.makeText(this,"onStop called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy() called",Toast.LENGTH_SHORT).show();
    }

    protected void onSaveInstanceState(Bundle savedInstancestate)
    {
        super.onSaveInstanceState(savedInstancestate);
        savedInstancestate.putString("message",msg);
        Toast.makeText(this,"onSaveInstancestate() called and message saved",Toast.LENGTH_SHORT).show();
    }

    protected void onRestoreInstanceState(Bundle inState)
    {
        super.onRestoreInstanceState(inState);
        if(inState==null)
            Toast.makeText(this,"state not saved",Toast.LENGTH_SHORT).show();
            else
        {
           String savedMessage= inState.getString("message");
            Toast.makeText(this,"onRestore() called saved message is"+savedMessage,Toast.LENGTH_SHORT).show();
        }
    }

    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"onRestart() called",Toast.LENGTH_SHORT).show();
    }
}
