package khoapham.ptp.phamtanphat.sqlite;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static SQLite sqLite;
    ListView listView;
    MonanAdapter monanAdapter;
    ArrayList<Monan> mangmonan = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tao database
        sqLite = new SQLite(this,"Quanlymonan.sql", null , 1);

        listView = findViewById(R.id.listview);
        monanAdapter = new MonanAdapter(this,mangmonan);

        listView.setAdapter(monanAdapter);
        // Tao bang
        //Cau truc du lieu
//        String createtable = "CREATE TABLE IF NOT EXISTS Monan(Id INTEGER PRIMARY KEY AUTOINCREMENT, Tenmonan VARCHAR , Diachi VARCHAR , Gia INTEGER)";
//        sqLite.Querydata(createtable);
        //Them du lieu vao trong bang
//        String insertdata = "INSERT INTO Monan VALUES (null,'Bánh bao','Quận 4',25000)";
//        String insertdata1 = "INSERT INTO Monan VALUES (null,'Chả cá','Quận 5',40000)";
//        String insertdata2 = "INSERT INTO Monan VALUES (null,'Chả tôm','Quận 6',35000)";
//        sqLite.Querydata(insertdata);
//        sqLite.Querydata(insertdata2);
//        sqLite.Querydata(insertdata1);
        selectDatabase();

    }
    private void selectDatabase(){
        String getAlldata = "SELECT * FROM Monan";
        Cursor cursor = sqLite.Getdata(getAlldata);
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String ten = cursor.getString(1);
            String diachia = cursor.getString(2);
            int gia = cursor.getInt(3);
            mangmonan.add(new Monan(id , ten ,diachia, gia));
        }
        monanAdapter.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_chuc_nang,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemThem :
                Intent intent = new Intent(MainActivity.this , ThemdulieuActivity.class);
                startActivity(intent);
        }
        return true;
    }
}
