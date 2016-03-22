package com.wjustudio.servicedialog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void dialog(View view){
        Intent intent = new Intent(this,DialogService.class);
        intent.putExtra("type","dialog");
        startService(intent);
    }

    public void progress(View view){
        Intent intent = new Intent(this,DialogService.class);
        intent.putExtra("type","progress");
        startService(intent);
    }


}
