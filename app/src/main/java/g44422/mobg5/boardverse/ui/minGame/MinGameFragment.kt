package g44422.mobg5.boardverse.ui.minGame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import g44422.mobg5.boardverse.R

class MinGameFragment : Fragment() {
    private lateinit var minGameViewModel : MinGameViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        minGameViewModel = ViewModelProviders.of(this).get(MinGameViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_min_game, container, false)
        return root
    }
}
