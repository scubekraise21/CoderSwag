package Controller

import Adapter.CategorYAdapter
import Model.Category
import Services.DataService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategorYAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter =CategorYAdapter(this,DataService.categories)
        categorylistview.adapter= adapter
        categorylistview.setOnItemClickListener { adapterView, view, position, id ->
            val category =DataService.categories[position]
            Toast.makeText(this,"You clicked on the ${category.title} cell",Toast.LENGTH_SHORT).show()

        }


    }
}
