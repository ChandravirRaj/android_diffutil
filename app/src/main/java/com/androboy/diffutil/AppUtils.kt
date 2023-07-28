package com.androboy.diffutil

object AppUtils {

    fun loadData(): MutableList<ItemsViewModel> {
        val nameList: MutableList<ItemsViewModel> = mutableListOf()
        nameList.add(ItemsViewModel(1, R.drawable.ic_book, "Book 1"))
        nameList.add(ItemsViewModel(2, R.drawable.ic_book, "Book 2"))
        nameList.add(ItemsViewModel(3, R.drawable.ic_book, "Book 3"))
        nameList.add(ItemsViewModel(4, R.drawable.ic_book, "Book 4"))
        nameList.add(ItemsViewModel(5, R.drawable.ic_book, "Book 5"))
        return nameList
    }

    fun loadData1(): MutableList<ItemsViewModel> {
        val nameList: MutableList<ItemsViewModel> = mutableListOf()
        nameList.add(ItemsViewModel(4, R.drawable.ic_book, "Book 4"))
        nameList.add(ItemsViewModel(5, R.drawable.ic_book, "Book 5"))
        nameList.add(ItemsViewModel(6, R.drawable.ic_book, "Book 6"))
        nameList.add(ItemsViewModel(7, R.drawable.ic_book, "Book 7"))
        nameList.add(ItemsViewModel(8, R.drawable.ic_book, "Book 8"))
        nameList.add(ItemsViewModel(9, R.drawable.ic_book, "Book 9"))
        nameList.add(ItemsViewModel(10, R.drawable.ic_book, "Book 10"))
        nameList.add(ItemsViewModel(11, R.drawable.ic_book, "Book 11"))
        nameList.add(ItemsViewModel(12, R.drawable.ic_book, "Book 12"))
        return nameList
    }

    fun loadData2(): MutableList<ItemsViewModel> {
        val nameList: MutableList<ItemsViewModel> = mutableListOf()
        nameList.add(ItemsViewModel(11, R.drawable.ic_book, "Book 1"))
        nameList.add(ItemsViewModel(4, R.drawable.ic_book, "Book 4"))
        nameList.add(ItemsViewModel(5, R.drawable.ic_book, "Book 5"))
        nameList.add(ItemsViewModel(10, R.drawable.ic_book, "Book 10"))
        nameList.add(ItemsViewModel(11, R.drawable.ic_book, "Book 11"))
        nameList.add(ItemsViewModel(12, R.drawable.ic_book, "Book 12"))
        nameList.add(ItemsViewModel(13, R.drawable.ic_book, "Book 13"))
        nameList.add(ItemsViewModel(14, R.drawable.ic_book, "Book 14"))
        return nameList
    }
}