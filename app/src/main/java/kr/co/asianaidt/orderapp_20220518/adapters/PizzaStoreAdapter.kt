package kr.co.asianaidt.orderapp_20220518.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kr.co.asianaidt.orderapp_20220518.R
import kr.co.asianaidt.orderapp_20220518.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<StoreData>
) :ArrayAdapter<StoreData>(mContext, resId, mList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list, null)
        }

        val row = tempRow!!

        val data = mList[position]
        val imgLog = row.findViewById<ImageView>(R.id.imgLogo)
        val txtStoreName = row.findViewById<TextView>(R.id.pizzaStoreListView)

        txtStoreName.text = data.name
        Glide.with(mContext).load(data.logoURL).into(imgLog)

        return row
    }
}