package br.com.transsp.ui.search.line

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.transsp.databinding.FragmentLineBinding
import br.com.transsp.ui.search.Search
import br.com.transsp.ui.search.line.Line

class LineFragment : Fragment() {

    private var _binding: FragmentLineBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val line =
            ViewModelProvider(this).get(Line::class.java)

        _binding = FragmentLineBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}