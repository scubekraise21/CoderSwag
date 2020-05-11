package Controller

import Adapter.ProductAdapter
import Services.DataService
import Utility.EXTRA_CATEGORY
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {


    lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType=intent.getStringExtra(EXTRA_CATEGORY)
        adapter= ProductAdapter(this,DataService.getProducts(categoryType))

        var spanCount= 2
        val orientation= resources.configuration.orientation
        if(orientation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount=3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize>720){
            spanCount=3
        }
        val layoutManager = GridLayoutManager(this,spanCount)
        productlistview.layoutManager = layoutManager
        productlistview.adapter= adapter


    }
}
