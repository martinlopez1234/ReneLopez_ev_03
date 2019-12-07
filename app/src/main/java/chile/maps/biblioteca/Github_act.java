package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Github_act extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView8;

    private String[] precioss = new String[]{"7000", "22000", "45000", "88000", "156000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);


        spinner = (Spinner) findViewById(R.id.spinner);

        textView8 = (TextView) findViewById(R.id.textView8);


        Bundle datos = getIntent().getExtras();
        String[] listaa = datos.getStringArray("libross");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaa);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(spinner.getSelectedItem().equals("Revival"))
                {

                    String precioR = precioss[1];

                    int pr = Integer.parseInt(precioR);

                    textView8.setText("El valor de Revival es:"+pr);
                }

                if(spinner.getSelectedItem().equals("Farenheit"))
                {
                    String precioFarenheit = precioss[0];

                    int pf = Integer.parseInt(precioFarenheit);

                    textView8.setText("El valor de Farenheit es : "+ pf);


                }




                if(spinner.getSelectedItem().equals("El Alquimista"))
                {
                    String precioElAlquimista = precioss[2];

                    int pe = Integer.parseInt(precioElAlquimista);

                    textView8.setText("El valor de El Alquimista es : "+ pe);
                }

                if(spinner.getSelectedItem().equals("El Poder"))
                {
                    String precioElPoder = precioss[3];

                    int pp = Integer.parseInt(precioElPoder);

                    textView8.setText("El valor de El Poder es : "+ pp);
                }

                if(spinner.getSelectedItem().equals("Despertar"))
                {
                    String precioDespertar = precioss[4];

                    int pd = Integer.parseInt(precioDespertar);

                    textView8.setText("El valor de Despertar es : "+ pd);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}



