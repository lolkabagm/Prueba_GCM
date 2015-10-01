package kevin.prueba_gcm;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.google.android.gms.gcm.GcmListenerService;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textViewImei);
        textView.setText(Utilidades.DameIMEI(getApplicationContext()));

    }

    public void boton(View view) throws Exception {
        MiInstanceIDListenerService regitroGcmcAsyncTask = new MiInstanceIDListenerService();
        regitroGcmcAsyncTask.onTokenRefresh();
}


}
