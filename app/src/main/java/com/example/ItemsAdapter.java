import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
public class ItemsAdapter extends ArrayAdapter<String> {
    public ItemsAdapter(Context context) {
        super(context, android.R.layout.simple_list_item_1);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = (TextView) convertView.findViewById(R.id.text);
        textView.setText(getItem(position));
        return convertView;
    }
}