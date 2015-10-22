package com.example.medhigh.easysoap;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import wcf.IServiceEvents;
import wcf.OperationResult;
import wcf.PatientBinding;
import wcf.RequestResultOfAuthtokenXmlkZUuIBUF;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.text)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        new AsyncCaller().execute();
    }
    private class AsyncCaller extends AsyncTask<Void, Void, String> implements IServiceEvents
    {
        ProgressDialog pdLoading = new ProgressDialog(MainActivity.this);

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //this method will be running on UI thread
            pdLoading.setMessage("\tLoading...");
            pdLoading.show();
        }
        @Override
        protected String doInBackground(Void... params) {
//            PatientBinding binding = new PatientBinding();
//            RequestResultOfAuthtokenXmlkZUuIBUF rq = binding.PatientLogin("ilya123", "test123");
//            //AuthtokenXml token = rq.result;
            PatientBinding binding = new PatientBinding(this,
                    "http://meetmdservice.azurewebsites.net/API");
            RequestResultOfAuthtokenXmlkZUuIBUF brcRequestResultOfboolean;
            try {
                brcRequestResultOfboolean= binding.PatientLogin("kostya123","test123");
                return brcRequestResultOfboolean.Result.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "huinia";//token.token;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            textView.setText(result);
            pdLoading.dismiss();
        }

        @Override
        public void Starting() {
            Log.d("333_Starting","Starting");
        }

        @Override
        public void Completed(OperationResult result) {
            Log.d("333_Completed","Completed");
        }
    }
}
