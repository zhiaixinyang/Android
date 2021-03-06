package com.example.myhelotest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// 创建ViewModel供三个Fragment共同使用
class MyViewModel: ViewModel(){

    // 将RecycleView数据存储在LiveData中
    private var fruitsLiveData:MutableLiveData<List<Fruit>>? = null

    /**
     * 获取LiveData->返回LiveData(不可修改)
     */
    fun getFruitsLiveData():LiveData<List<Fruit>>{
        if(fruitsLiveData == null){
            fruitsLiveData = MutableLiveData()
            loadFruits()
        }
//        println("MyViewModel:"+ fruitsLiveData?.value)
        val ret = fruitsLiveData as LiveData<List<Fruit>>
//        println("MyViewModel:"+ret)

        return ret
    }

    /**
     * 加载初始化的水果集合
     */
    private fun loadFruits(){
        val fruitList = initFruits()
        fruitsLiveData?.value = fruitList
    }

    private fun initFruits(): MutableList<Fruit> {
        val fruitList = mutableListOf<Fruit>()
        for(i in 0..1){
            val apple = Fruit("Apple",R.drawable.apple_pic)
            fruitList.add(apple)
            val banana = Fruit("Banana",R.drawable.banana_pic)
            fruitList.add(banana)
            val orange = Fruit("Orange",R.drawable.orange_pic)
            fruitList.add(orange)
            val watermelon = Fruit("Watermelon",R.drawable.watermelon_pic)
            fruitList.add(watermelon)
            val pear = Fruit("Pear",R.drawable.pear_pic)
            fruitList.add(pear)
            val grape = Fruit("Grape",R.drawable.grape_pic)
            fruitList.add(grape)
            val pineapple = Fruit("Pineapple",R.drawable.pineapple_pic)
            fruitList.add(pineapple)
            val strawberry = Fruit("Strawberry",R.drawable.strawberry_pic)
            fruitList.add(strawberry)
            val cherry = Fruit("Cherry",R.drawable.cherry_pic)
            fruitList.add(cherry)
            val mango = Fruit("Mango",R.drawable.mango_pic)
            fruitList.add(mango)
        }
        return fruitList
    }
}