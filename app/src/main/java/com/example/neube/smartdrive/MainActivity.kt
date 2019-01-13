package com.example.neube.smartdrive

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import com.example.neube.smartdrive.BR.back
import com.example.neube.smartdrive.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {

        DataBindingUtil.bind<ActivityMainBinding>(viewRoot)!!

    }

    private val viewModel: BackViewModel by lazy {
        ViewModelProviders.of(this).get(BackViewModel::class.java)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.back
    //    binding.setBack(back)

     //   binding.back = viewModel.back

  //      toggleButton1.setBackgroundResource(viewModel.back.mDrawableResource)
   //     toggleButton1.setOnClickListener { viewModel.updateDrawableResource()}
//
//        toggleButton1.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//
//                displayToast(message = "Toggle Button Drawable State is Filled?")
//
//            } else {
//
//                displayToast(message = "Toggle Button State is checked?")
//            }
//        }


  //      toggleButton1.setOnCheckedChangeListener(this)

    }

//    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
//        when (p0?.id) {
//            R.id.toggleButton1 -> displayToast(message = "Toggle Button Drawable State is Filled? $p1")
//            else -> displayToast(message = "Toggle Button State is checked? $p1")
//        }
//    }

    fun displayToast(context: Context = this, message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(context, message, duration).show()
    }
}
