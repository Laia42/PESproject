package edu.upc.fib.pes_infovid19


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.upc.fib.pes_infovid19.ui.main.HealthMenuActivity
import edu.upc.fib.pes_infovid19.ui.main.HospitalCenterActivity
import edu.upc.fib.pes_infovid19.ui.main.InfectionProbabilityTestActivity
import edu.upc.fib.pes_infovid19.ui.main.UserProfileActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        buttonConsultarInfo.setOnClickListener {
            val intent = Intent(this, HealthMenuActivity::class.java)
            startActivity(intent)
        }

        buttonCentreHospitalari.setOnClickListener {
            val intent = Intent(this, HospitalCenterActivity::class.java)
            startActivity(intent)
        }

        buttonTestContagi.setOnClickListener {
            val intent = Intent(this, InfectionProbabilityTestActivity::class.java)
            startActivity(intent)
        }

        buttonProfile.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }

        buttonObrirTestVulnerable.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    VulnerableTestActivity::class.java
                )
            )
        }

        fab.setOnClickListener {
        }
    }
}