package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BASE_ACT extends AppCompatActivity {

    private EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base__act);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);


    }

    public void añadirLibro(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "Gestion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        if (!et1.getText().toString().isEmpty()) {
            ContentValues registro = new ContentValues();
            registro.put("codigo", et1.getText().toString());
            registro.put("nombre", et2.getText().toString());
            registro.put("precio", et3.getText().toString());

            BaseDeDatos.insert("libros", null, registro);
            BaseDeDatos.close();

            Toast.makeText(this, "Se ha ingresado un libro", Toast.LENGTH_LONG).show();

        }
    }

    public void modificarLibros(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "Gestion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String codigo = et1.getText().toString();


        ContentValues cont = new ContentValues();
        cont.put("codigo", et1.getText().toString());
        cont.put("nombre", et2.getText().toString());
        cont.put("precio", et3.getText().toString());

        if (!et1.getText().toString().isEmpty()) {

            BaseDeDatos.update("libros", cont, "codigo=" + codigo, null);


            Toast.makeText(this, "Se ha modificado el libro con el codigo"+codigo, Toast.LENGTH_LONG).show();

        }
    }


        public void eliminarLibros (View view){
            AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "Gestion", null, 1);
            SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

            String codigo = et1.getText().toString();


            BaseDeDatos.delete("libros", "codigo=" + codigo, null);


            BaseDeDatos.close();

            Toast.makeText(this, "Se ha eliminado el libro con el codigo" + codigo, Toast.LENGTH_LONG).show();

        }
    }
