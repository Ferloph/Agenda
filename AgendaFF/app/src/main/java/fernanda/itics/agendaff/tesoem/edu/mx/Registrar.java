package fernanda.itics.agendaff.tesoem.edu.mx;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.OutputStreamWriter;

public class Registrar extends AppCompatActivity {
    EditText b, c, d , e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        b = (EditText) findViewById(R.id.b);
        c = (EditText) findViewById(R.id.c);
        d = (EditText) findViewById(R.id.d);
        e = (EditText) findViewById(R.id.e);
    }

    public void regresa(View v){

        cargaactividad();
    }

    public void btnguardar(View v){
        guardar(b.getText().toString() + "," + c.getText().toString() + "," + d.getText().toString() + "," + e.getText().toString());
        cargaactividad();
    }

    public void guardar(String dato){
        try{
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("Datos.txt", Context.MODE_APPEND));
            archivo.write(dato + "\n");
            archivo.close();
            Toast.makeText(this, "Se grabo la informacion correctamente", Toast.LENGTH_SHORT).show();
        }catch (Exception ex){
            Log.e("Error","Error al escribir archivo");
        }
    }

    private void cargaactividad(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}



