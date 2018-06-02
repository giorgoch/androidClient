package com.client.giorgoch.client;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class MainActivity extends AppCompatActivity {

    Button btnCallRestApi;
    EditText my_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCallRestApi = (Button) findViewById(R.id.btnCallRestApi);
        btnCallRestApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new HttpReqTask().execute();
            }
        });
    }

    private class HttpReqTask extends AsyncTask<Void, Void, Draw[]> {

        @Override
        protected Draw[] doInBackground(Void... voids) {

            try {
                String apiUrl = "http://applications.opap.gr/DrawsRestServices/lotto/last.json";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Draw[] draws = restTemplate.getForObject(apiUrl, Draw[].class);

                return draws;
            } catch (Exception e) {
                e.getMessage();

            }
            return null;
        }

        @Override
        protected void onPostExecute(Draw[] draws) {
            super.onPostExecute(draws);

            EditText et = (EditText) findViewById(R.id.my_edit);
            et.setText(draws.toString());
        }
    }
}
