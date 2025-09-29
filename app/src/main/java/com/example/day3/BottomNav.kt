package com.example.day3

import android.os.Bundle
import android.view.View
import android.widget.Button

class BottomNav : androidx.fragment.app.Fragment(R.layout.bottom_nav) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val manager = parentFragmentManager
        val add_btn : Button = view.findViewById(R.id.add_btn)
        val hide_add_btn : Button = view.findViewById(R.id.hide_and_add_btn)
        val replace_btn : Button = view.findViewById(R.id.replace_btn)
        val remove_btn : Button = view.findViewById(R.id.remove_btn)
        val frag1 = parentFragmentManager.findFragmentByTag("Frag1")?: Fragment1()
        add_btn.setOnClickListener {
            manager.beginTransaction()
                .add(R.id.top_view, Fragment2())
                .addToBackStack(null)
                .commit()
        }
        hide_add_btn.setOnClickListener {
            manager.beginTransaction()
                .hide(frag1)
                .add(R.id.top_view, Fragment2())
                .addToBackStack(null)
                .commit()
        }
        replace_btn.setOnClickListener {
            manager.beginTransaction()
                .replace(R.id.top_view, Fragment2())
                .addToBackStack(null)
                .commit()
        }
        remove_btn.setOnClickListener {
            manager.beginTransaction()
                .remove(frag1)
                .add(R.id.top_view, Fragment2())
                .addToBackStack(null)
                .commit()
        }
    }
}
