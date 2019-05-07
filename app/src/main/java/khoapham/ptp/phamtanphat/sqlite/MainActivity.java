package khoapham.ptp.phamtanphat.sqlite;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    SQLite sqLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tao database
        sqLite = new SQLite(this,"Quanlymonan.sql", null , 1);
        // Tao bang
        //Cau truc du lieu
//        String createtable = "CREATE TABLE IF NOT EXISTS Monan(Id INTEGER AUTO_INCREMENT PRIMARY KEY , Tenmonan VARCHAR , Diachi VARCHAR , Gia INTEGER)";
//        sqLite.Querydata(createtable);
        //Them du lieu vao trong bang
//        String insertdata = "INSERT INTO Monan VALUES (null,'Bánh canh','Quận 3',30000)";
//        sqLite.Querydata(insertdata);
        String getAlldata = "SELECT * FROM Monan";
        Cursor cursor = sqLite.Getdata(getAlldata);
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String ten = cursor.getString(1);
            String diachia = cursor.getString(2);
            int gia = cursor.getInt(3);

            Log.d("BBB", ten);
        }
    }
}
