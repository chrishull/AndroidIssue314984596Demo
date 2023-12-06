package com.example.r8bugdemo2

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SAOverscrollLLManagerTest : LinearLayoutManager {

    /**
     * These constructors must be implemented.
     * <init>(Context!) defined in androidx.recyclerview.widget.LinearLayoutManager
     * <init>(Context!, AttributeSet!, Int, Int) defined in androidx.recyclerview.widget.LinearLayoutManager
     * <init>(Context!, Int, Boolean) defined in androidx.recyclerview.widget.LinearLayoutManager
     */
    constructor (context: Context) : super(context) {
    }

    constructor (context: Context, attributeSet: AttributeSet, int1: Int, int2: Int) :
            super(context, attributeSet, int1, int2) {
    }

    constructor (context: Context, int: Int, boolean: Boolean) :
            super(context, int, boolean) {
    }

    /**
     * Setup RecyclerView to perform bounce animation.
     * This Layout manager will detect the overscroll.
     *
     * @param recyclerView to setup for scroll bounce animation.
     */
    fun setRecyclerView(recyclerView: RecyclerView) {
        // use this setting to improve performance if changes in content do not change
        // layout size of RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = this
        // recyclerView.overScrollMode = View.OVER_SCROLL_ALWAYS
        // recyclerView.edgeEffectFactory = BounceEdgeEffectFactory()
    }

}
