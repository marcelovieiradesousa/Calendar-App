package me.mcl.appcalendar


import android.content.Intent
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Events.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.btn_access) as Button
        btn.setOnClickListener {

            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE, "Culto Online")
                .putExtra(EVENT_LOCATION, "ONLINE")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, System.currentTimeMillis())
                .putExtra(
                    CalendarContract.EXTRA_EVENT_END_TIME,
                    System.currentTimeMillis() + (60 * 60 * 1000)
                )

            startActivity(intent)
        }
    }
}