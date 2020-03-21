package com.amanguru.testmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amanguru.custom.Data

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var data= Data()
        data.data()
    }
}
