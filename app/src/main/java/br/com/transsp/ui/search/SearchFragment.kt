package br.com.transsp.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.commit
import br.com.transsp.databinding.FragmentSearchBinding
import br.com.transsp.ui.search.route.RouteFragment
import br.com.transsp.ui.search.line.LineFragment
import br.com.transsp.ui.search.local.LocalFragment
import br.com.transsp.R


class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val search = ViewModelProvider(this).get(Search::class.java)

        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configurar listeners dos botões para navegar para outros fragments
        binding.btnRoute.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.fragment_container_view, RouteFragment())
                addToBackStack(null)
            }
        }

        binding.btnLine.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.fragment_container_view, LineFragment())
                addToBackStack(null)
            }
        }

        binding.btnLocation.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.fragment_container_view, LocalFragment())
                addToBackStack(null)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
