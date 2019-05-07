package khoapham.ptp.phamtanphat.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }
}
