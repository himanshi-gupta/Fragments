package com.example.day3

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.frag_1_view) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Poshmark", "In Frag onViewCreated()")

        val textView1: TextView = view.findViewById(R.id.textView1)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Poshmark", "In Frag onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Poshmark", "In Frag onCreate()")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Poshmark", "In Frag OnCreateView()")
        return inflater.inflate(R.layout.frag_1_view, container, false)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Poshmark", "In Frag onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Poshmark", "In Frag onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Poshmark", "In Frag onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Poshmark", "In Frag onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Poshmark", "In Frag OnDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Poshmark", "In Frag OnDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Poshmark", "In Frag onDetach()")
    }
}
