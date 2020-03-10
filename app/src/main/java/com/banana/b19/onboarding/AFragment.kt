package com.banana.b19.onboarding




import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import kotlinx.android.synthetic.main.fragment_first.*

fun newFragment(color: Int, Image: Int, Text: String, textcolor: Int ):AFragment{
    val fragment = AFragment()
    val arguments = Bundle()
    arguments.putInt("COLORT", textcolor)
    arguments.putInt("COLOR", color)
    arguments.putInt("IMAGE", Image)
    arguments.putString("TEXT", Text)
    fragment.arguments = arguments
    return fragment
}

/**
 * A simple [Fragment] subclass.
 */
class AFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val color = arguments?.getInt("COLOR")!!
        val vid = arguments?.getInt("IMAGE")!!
        val textcolor = arguments?.getInt("COLORT")!!
        TExt.setTextColor(textcolor)
        imageView.setBackgroundResource(vid)
        view.setBackgroundColor(color)
    }


}
