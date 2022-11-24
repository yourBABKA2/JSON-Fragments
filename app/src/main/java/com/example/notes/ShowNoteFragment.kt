package com.example.notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notes.databinding.FragmentShowNoteFragmentBinding

class ShowNoteFragment : Fragment() {

    lateinit var binding: FragmentShowNoteFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentShowNoteFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSave.setOnClickListener {
            activity
                ?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.list_fragment, ListFragment())
                ?.commit()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ShowNoteFragment()
    }
}