// SecondActivity.kt
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        val text1 = intent.getStringExtra("text1")
        val text2 = intent.getStringExtra("text2")
        textView.text = "Text1: $text1\nText2: $text2"
        setContentView(textView)
    }
}