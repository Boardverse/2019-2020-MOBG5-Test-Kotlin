package g44422.mobg5.boardverse.ui.carousel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import g44422.mobg5.boardverse.R

class CarouselFragment : Fragment() {

    private lateinit var carouselViewModel : CarouselViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        carouselViewModel = ViewModelProviders.of(this).get(CarouselViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_carousel, container, false)
        return root
    }
}

