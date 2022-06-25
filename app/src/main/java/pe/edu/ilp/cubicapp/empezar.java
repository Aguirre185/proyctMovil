package pe.edu.ilp.cubicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class empezar extends AppCompatActivity {


    public EditText et1;
    public EditText et2;
    public EditText et3;
    public TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empezar);
        et1=(EditText) findViewById(R.id.txtuno);
        et2=(EditText) findViewById(R.id.txtdos);
        et3=(EditText) findViewById(R.id.txttres);
        tv1=(TextView)findViewById(R.id.txtResultado);
    }
    public void Cubicar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        String valor3=et3.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int n3=Integer.parseInt(valor3);
        double RG=(n1*n2*n3)/12;

        Math.floor(RG);
        tv1.setText("El bloque Tiene "+RG+" pies");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad est� a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad est� a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora est� "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad est� a punto de ser destruida.
    }



}