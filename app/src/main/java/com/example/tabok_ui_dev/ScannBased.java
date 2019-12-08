package com.example.tabok_ui_dev;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.Result;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScannBased extends AppCompatActivity implements ZXingScannerView.ResultHandler{

    private ZXingScannerView scannerView;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scann_based);

        scannerView = (ZXingScannerView)findViewById(R.id.scannerView);
        txtResult = (TextView)findViewById(R.id.text);

        Dexter.withActivity(this).withPermission(Manifest.permission.CAMERA).withListener(new PermissionListener() {
            @Override
            public void onPermissionGranted(PermissionGrantedResponse response) {
                scannerView.setResultHandler(ScannBased.this);
                scannerView.startCamera();
            }

            @Override
            public void onPermissionDenied(PermissionDeniedResponse response) {
                Toast.makeText(ScannBased.this,"You Must to allow this permission", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {

            }
        }).check();
        onBackPressed();
    }
    protected void onDestroy(){
        scannerView.stopCamera();
        super.onDestroy();
    }

    @Override
    public void handleResult(Result result) {
        txtResult.setText(result.getText());
    }

    public void onBackPressed(){
        super.onBackPressed();
    }
}
