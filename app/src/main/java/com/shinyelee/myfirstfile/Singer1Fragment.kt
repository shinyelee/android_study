package com.shinyelee.myfirstfile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_singer1, container, false)

        val items = mutableListOf<String>()
        items.add("Shark")
        items.add("Dun Dun Dance")
        items.add("살짝 설렜어")
        items.add("게릴라")
        items.add("Twilight")
        items.add("BUNGEE")
        items.add("다섯 번째 계절")
        items.add("불꽃놀이")
        items.add("비밀정원")
        items.add("컬러링북")
        items.add("내 얘길 들어봐")
        items.add("WINDY DAY")
        items.add("LIAR LIAR")
        items.add("CLOSER")
        items.add("CUPID")

        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val image2 = view.findViewById<ImageView>(R.id.image2)
        image2.setOnClickListener {
            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer2Fragment)
        }

        val image3 = view.findViewById<ImageView>(R.id.image3)
        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer3Fragment)
        }

        return view
    }

}