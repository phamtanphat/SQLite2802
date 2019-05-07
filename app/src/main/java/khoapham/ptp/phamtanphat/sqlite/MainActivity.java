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
//        sqLite = new SQLite(this,"Quanlymonan.sql", null , 1);
        //
    }
}
