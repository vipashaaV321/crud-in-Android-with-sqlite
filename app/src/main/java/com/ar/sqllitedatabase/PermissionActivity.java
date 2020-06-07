package com.ar.sqllitedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PermissionActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnInternet, btnStorage, btnCamera, btnGps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);
        btnInternet = (Button) findViewById(R.id.btn_internet);
        btnStorage = (Button) findViewById(R.id.btn_storage);
        btnCamera = (Button) findViewById(R.id.btn_camera);
        btnGps = (Button) findViewById(R.id.btn_gps);

        btnInternet.setOnClickListener(this);
        btnStorage.setOnClickListener(this);
        btnCamera.setOnClickListener(this);
        btnGps.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_internet:

                /*if (!isConnectedToInternet(this)){

                    Toast.makeText(this, "Connect your Internet", Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
                }
*/

                break;

            case R.id.btn_storage:
                break;
            case R.id.btn_camera:
                break;
            case R.id.btn_gps:
                break;
            default:


        }
    }
}
