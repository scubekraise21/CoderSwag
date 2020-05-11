package Controller

import Adapter.CategorYAdapter
import Adapter.CategoryRecycleAdapter
import Model.Category
import Services.DataService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter =CategoryRecycleAdapter(this,DataService.categories)
        categorylistview.adapter= adapter

        val layoutManager = LinearLayoutManager(this)
        categorylistview.layoutManager = layoutManager
        categorylistview.setHasFixedSize(true)


        }


    }

