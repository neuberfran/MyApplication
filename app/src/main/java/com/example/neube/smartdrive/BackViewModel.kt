package com.example.neube.smartdrive

import android.arch.lifecycle.ViewModel


    class BackViewModel : ViewModel() {

        val back = Back()

        val partfirebase = Fireback().imageId()

        fun updateDrawableResource(){

            back.mDrawableResource=partfirebase
     //       val back = 1

        }

    }
