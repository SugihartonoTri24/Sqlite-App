package com.example.aplikasisqlitetri

import android.app.Activity
import android.content.*
import android.icu.text.LocaleDisplayNames
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class AdapterMataKuliah  (
    private val getContext: Context,
    private val customListItem: ArrayList<MataKuliah>
        ):
        ArrayAdapter <MataKuliah>(getContext, 0, customListItem) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listLayout = convertView
        val holder: ViewHolder
        if (listLayout == null) {
            val inflateList = (getContext as Activity).layoutInflater
            listLayout = inflateList.inflate(R.layout.layout_matkul, parent, false)
            holder = ViewHolder()
            with(holder) {
                tvNmMatkul = listLayout.findViewById(R.id.tvNmMatkul)
                tvKdMatKul = listLayout.findViewById(R.id.tvKdMatkul)
                btnEdit = listLayout.findViewById(R.id.btnEdit)
                btnHapus = listLayout.findViewById(R.id.btnHapus)
            }
            listLayout.tag = holder
        } else
            holder = listLayout.tag as ViewHolder
        val listItem = customListItem[position]
        holder.tvNmMatkul!!.setText(listItem.nmMatkul)
        holder.tvKdMatKul!!.setText(listItem.kdMatkul)

        return listLayout!!
    }

    class ViewHolder {
        internal var tvNmMatkul: TextView? = null
        internal var tvKdMatKul: TextView? = null
        internal var btnEdit: ImageButton? = null
        internal var btnHapus: ImageButton? = null
    }
}


