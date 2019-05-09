package khoapham.ptp.phamtanphat.sqlite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MonanAdapter extends ArrayAdapter<MonanAdapter> {

    public MonanAdapter(@NonNull Context context,@NonNull List<MonanAdapter> objects) {
        super(context, R.layout.dong_item_monan, objects);
    }


    @NonNull
    @Override
    public View getView(int position,@Nullable View convertView,@NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.dong_item_monan,null);

        TextView txtten = convertView.findViewById(R.id.textviewTen);
        TextView txtdiachi = convertView.findViewById(R.id.textviewDiachi);
        TextView txtgia = convertView.findViewById(R.id.textviewGia);

        return convertView;
    }
}
