package aldoacosta.practicaspinnerywebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btnIr;
    Spinner spnPaginasWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIr = (Button) findViewById(R.id.btnIr);
        spnPaginasWeb = (Spinner) findViewById(R.id.spnPaginasweb);
        String[] paginas = {"Pagina misteriosa", "Wikipedia", "ChatGpt"};
        spnPaginasWeb.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, paginas));
    }

    public void clic(View v){
        Intent siguiente = new Intent(this, Main2Activity.class);
        if (spnPaginasWeb.getSelectedItem().toString() == "Pagina misteriosa"){
            siguiente.putExtra("paginaWeb","matias.ma/nsfw/");
        }else if(spnPaginasWeb.getSelectedItem().toString() == "Wikipedia"){
            siguiente.putExtra("paginaWeb","www.wikipedia.org");
        }else if(spnPaginasWeb.getSelectedItem().toString() == "ChatGpt"){
            siguiente.putExtra("paginaWeb","chat.openai.com");
        }
        startActivity(siguiente);
    }


}
