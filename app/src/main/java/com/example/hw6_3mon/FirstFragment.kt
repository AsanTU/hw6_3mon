package com.example.hw6_3mon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw6_3mon.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val foodsList = arrayListOf(
        Foods("https://i.obozrevatel.com/food/recipemain/2019/1/9/125.jpg?size=636x424", "Манты"),
        Foods("https://kuhnimira.top/wp-content/uploads/2023/03/tenbel-pahlava-azerbajdzhanskaya-kuhnya-reczepty.jpg", "Похлава"),
        Foods("https://sifudo.ru/image/cache/catalog/shop/0306202206_Burger_Sochniy-1600x1600.png", "Бургер"),
        Foods("https://vegafood.ru/upload/iblock/a01/fb7inmrw777jtl4vjo5isjpkjz8r18in.png", "Пельмени"),
        Foods("https://t3.gstatic.com/licensed-image?q=tbn:ANd9GcQ2MNJN2Xb3xjp9BvmpOtWhiwmTmiSJmzhrybn0euyrSgVaGDEV3tWG3tczQbN4EKeR", "Шавуха")
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inintAdapter()
    }

    private fun inintAdapter() {
        val adapter = FoodsAdapter(foodsList)
        binding.rvFoods.adapter = adapter
    }
}