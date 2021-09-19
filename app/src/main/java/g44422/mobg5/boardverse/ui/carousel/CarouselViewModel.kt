package g44422.mobg5.boardverse.ui.carousel

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import g44422.mobg5.boardverse.model.MinGame
import g44422.mobg5.boardverse.ui.minGame.MinGameFragment

class CarouselViewModel : ViewModel() {

    private val minGames = MutableLiveData<ArrayList<Fragment>>()

    fun addMinGames(minGames: ArrayList<MinGame>) {
        minGames.forEach { minGame: MinGame ->
            val mgf: MinGameFragment = MinGameFragment()
            val args: Bundle = Bundle()
            args.putParcelable("params", minGame)
            mgf.arguments = args
            this.minGames.value?.add(mgf)
        }
    }
}