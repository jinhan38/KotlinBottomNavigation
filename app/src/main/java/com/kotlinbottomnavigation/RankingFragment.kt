package com.kotlinbottomnavigation

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RankingFragment : Fragment() {

    //static
    companion object {
        const val TAG: String = "RankingFragment"
        fun newInstance(): RankingFragment{
            return RankingFragment()
        }
    }

    //fragment가 메모리에 올라갔을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
    }

    // 프래그먼트를 안고 있는 액티비에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach: ")
    }

    //뷰가 생성되었을 때
    // 프레그먼트와 레이아웃을 연결시켜주는 부분
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d(TAG, "onCreateView: ")

        return inflater.inflate(R.layout.fragment_ranking, container, false)
    }
}