package edu.upc.fib.pes_infovid19.ui.main

import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import edu.upc.fib.pes_infovid19.R
import kotlinx.android.synthetic.main.drop_down_textview_item.view.*

class RiskPopulationAdapter : RecyclerView.Adapter<RiskPopulationAdapter.ViewHolder>() {
    private var expandedPosition = -1
    private var riskPopulationList = emptyList<RiskPopulation>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.drop_down_textview_item))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val isExpanded = position == expandedPosition
        holder.bind(riskPopulationList[position], isExpanded)
        holder.itemView.setOnClickListener {
            expandedPosition = if (isExpanded) -1 else position
            notifyItemChanged(position)
        }
    }


    override fun getItemCount(): Int = riskPopulationList.size

    fun updateTestType(testTypeTests: List<RiskPopulation>) {
        riskPopulationList = testTypeTests
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(riskPopulation: RiskPopulation, isExpanded: Boolean) {
            itemView.titledropdown.text = riskPopulation.risk
            itemView.textdropdown.text = riskPopulation.risk + riskPopulation.description
            itemView.arrowDropDown.setImageResource(if (isExpanded) R.drawable.ic_baseline_keyboard_arrow_down_24 else R.drawable.ic_baseline_keyboard_arrow_up_24)
            itemView.textdropdown.isVisible = isExpanded
        }
    }
}