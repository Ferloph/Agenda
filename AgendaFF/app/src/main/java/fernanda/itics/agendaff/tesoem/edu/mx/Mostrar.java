package fernanda.itics.agendaff.tesoem.edu.mx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mostrar extends AppCompatActivity {
    TextView ln, lu, lc, lcc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle parametros = this.getIntent().getExtras();
        setContentView(R.layout.activity_mostrar);
        ln= (TextView) findViewById(R.id.ln);
        lu = (TextView) findViewById(R.id.lu);
        lc = (TextView) findViewById(R.id.lc);
        lcc = (TextView) findViewById(R.id.lcc);

        ln.setText(parametros.getString("nombre").toString());
        lu.setText(parametros.getString("usuario").toString());
        lc.setText(parametros.getString("contra").toString());
        lcc.setText(parametros.getString("correo").toString());
    }

    public void regresa(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();

    }
}
