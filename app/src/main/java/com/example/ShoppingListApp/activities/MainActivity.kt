import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    private lateinit var shoppingListItems: List<String>
    private lateinit var listView: ListView
    private lateinit var addButton: Button
    private lateinit var textField: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        addButton = findViewById(R.id.addButton)
        textField = findViewById(R.id.textField)

        shoppingListItems = ArrayList()
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shoppingListItems)
        listView.setAdapter(adapter)

        addButton.setOnClickListener { addButtonClicked() }
    }

    private fun addButtonClicked() {
        val newItem = textField.text.toString()
        shoppingListItems.add(newItem)
        adapter.notifyDataSetChanged()
        textField.text.clear()
    }
}