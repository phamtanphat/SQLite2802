package khoapham.ptp.phamtanphat.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class ThemdulieuActivity extends AppCompatActivity {

    EditText edtTen,edtGia,edtDiachi;
    Button btnHuy,btnXacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themdulieu);

        edtDiachi = findViewById(R.id.edittextDiachi);
        edtGia = findViewById(R.id.edittextGiamonan);
        edtTen = findViewById(R.id.edittextTenmonan);
        btnHuy = findViewById(R.id.buttonHuy);
        btnXacnhan = findViewById(R.id.buttonXacnhan);

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtTen.getText().toString();
                String gia = edtGia.getText().toString();
                String diachi = edtDiachi.getText().toString();
                if (!TextUtils.isEmpty(ten) && !TextUtils.isEmpty(gia) && !TextUtils.isEmpty(diachi)){
                    String insertData = "INSERT INTO Monan VALUES (null,'"+ten.trim()+"','"+diachi.trim()+"',"+Integer.parseInt(gia)+")";

                }
            }
        });
    }
}
