package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        EditText num = (EditText) findViewById(R.id.Number);
        TextView x = (TextView)findViewById(R.id.x);
        TextView y = (TextView)findViewById(R.id.y);
        int [] res = factor(Integer.parseInt(num.getText().toString()));

        x.setText(Integer.toString(res[0]));
        y.setText(Integer.toString(res[1]));

    }

    private int[] factor(int i) {
        int [] res = new int[2];
        if(Math.sqrt(i) % 1 == 0){
            return res = new int[]{(int) Math.sqrt(i), (int) Math.sqrt(i)};
        }
        int x = (int)Math.sqrt(i) + 1;

        while(true){
            if(Math.sqrt(Math.pow(x,2) - i) % 1 == 0 ){
                int result = (int) Math.sqrt(Math.pow(x,2) - i);
                return res = new int[]{x -  result, result + x};
            }
            else{
                x++;
            }
        }
    }

}
