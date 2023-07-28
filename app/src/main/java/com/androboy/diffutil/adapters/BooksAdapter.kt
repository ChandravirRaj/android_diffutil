package com.androboy.diffutil.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.androboy.diffutil.ItemsViewModel
import com.androboy.diffutil.databinding.CardViewDesignBinding


class BooksAdapter : RecyclerView.Adapter<BooksAdapter.ViewHolder>() {

    private val differCallback = object : DiffUtil.ItemCallback<ItemsViewModel>() {
        override fun areItemsTheSame(oldItem: ItemsViewModel, newItem: ItemsViewModel): Boolean {
            return oldItem.id == newItem.id
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: ItemsViewModel, newItem: ItemsViewModel): Boolean {
            return oldItem == newItem
        }

    }

    private val differ = AsyncListDiffer(this, differCallback)
    private lateinit var binding: CardViewDesignBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = CardViewDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = differ.currentList[position]
        holder.setData(model)

    }

    fun submitList(list: List<ItemsViewModel?>?) {
        differ.submitList(list)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class ViewHolder(private var binding: CardViewDesignBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setData(item: ItemsViewModel) {
            binding.apply {
                imageview.setImageResource(item.image)
                textView.text = item.text
            }
        }
    }


}
