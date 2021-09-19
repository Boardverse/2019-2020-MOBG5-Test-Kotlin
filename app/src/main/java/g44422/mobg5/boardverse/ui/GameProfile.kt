package g44422.mobg5.boardverse.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import g44422.mobg5.boardverse.R

class GameProfile : Fragment() {

    companion object {
        fun newInstance() = GameProfile()
    }

    private lateinit var viewModel: GameProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(GameProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
