package com.example.simplegmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>()
        items.add(ItemModel("Reddit", "4.1", R.drawable.reddit))
        items.add(ItemModel("Reuters News", "4.6", R.drawable.reutersnews))
        items.add(ItemModel("The New York Times", "4.6", R.drawable.thenewyorktimes))

        val items2 = arrayListOf<ItemModel>()
        items2.add(ItemModel("Traveloka: Hotels & Flights", "4.7", R.drawable.traveloka))
        items2.add(ItemModel("Triplt: Travel Planner", "4.6", R.drawable.triplt))
        items2.add(ItemModel("Qatar Airways", "4.7", R.drawable.qatar))
        items2.add(ItemModel("Trip.com", "4.7", R.drawable.trip))

        val items3 = arrayListOf<ItemModel>()
        items3.add(ItemModel("Quanda", "4.1", R.drawable.quanda))
        items3.add(ItemModel("Check Math", "4.6", R.drawable.checkmath))
        items3.add(ItemModel("Question AI", "4.6", R.drawable.questionai))


        val verticalRecyclerView = findViewById<RecyclerView>(R.id.vertical_recycler_view)
        val horizontalRecyclerView = findViewById<RecyclerView>(R.id.horizontal_recycler_view)

        val verticalLayoutManager = LinearLayoutManager(this)
        verticalLayoutManager.orientation = LinearLayoutManager.VERTICAL
        verticalRecyclerView.layoutManager = verticalLayoutManager

        val horizontalLayoutManager = LinearLayoutManager(this)
        horizontalLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        horizontalRecyclerView.layoutManager = horizontalLayoutManager
        horizontalRecyclerView.adapter = ItemAdapter(items)

        val horizontalRecyclerView2 = findViewById<RecyclerView>(R.id.horizontal_recycler_view_2)
        val horizontalLayoutManager2 = LinearLayoutManager(this)
        horizontalLayoutManager2.orientation = LinearLayoutManager.HORIZONTAL
        horizontalRecyclerView2.layoutManager = horizontalLayoutManager2
        horizontalRecyclerView2.adapter = ItemAdapter(items2)

        val horizontalRecyclerView3 = findViewById<RecyclerView>(R.id.horizontal_recycler_view_3)
        val horizontalLayoutManager3 = LinearLayoutManager(this)
        horizontalLayoutManager3.orientation = LinearLayoutManager.HORIZONTAL
        horizontalRecyclerView3.layoutManager = horizontalLayoutManager3
        horizontalRecyclerView3.adapter = ItemAdapter(items3)

    }
}