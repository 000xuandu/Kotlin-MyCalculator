package dulx.tutorials.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * In the larger project, we need to use View.OnClickListener
     */
    fun onDigit(view: View) {
        Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show()
    }
}