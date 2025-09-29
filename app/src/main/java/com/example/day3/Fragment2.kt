package com.example.day3

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.frag_2_view) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Poshmark", "In Frag 2 OnCreateView()")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Poshmark", "In Frag 2 onAttach()")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Poshmark", "In Frag 2 onViewCreated()")
        val textView1: TextView = view.findViewById(R.id.textView2)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Poshmark", "In Frag 2 onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Poshmark", "In Frag 2 onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Poshmark", "In Frag 2 onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Poshmark", "In Frag 2 onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Poshmark", "In Frag 2 onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Poshmark", "In Frag 2 OnDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Poshmark", "In Frag 2 OnDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Poshmark", "In Frag 2 onDetach()")

    }
}
