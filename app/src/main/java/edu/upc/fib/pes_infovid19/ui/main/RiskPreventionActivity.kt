package edu.upc.fib.pes_infovid19.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.upc.fib.pes_infovid19.R
import kotlinx.android.synthetic.main.activity_risk_prevention.*

class RiskPreventionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_risk_prevention)
        setSupportActionBar(toolbarRiskPrevention)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val adapter = RiskPreventionAdapter()
        recyclerViewRiskPrevention.adapter = adapter
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}