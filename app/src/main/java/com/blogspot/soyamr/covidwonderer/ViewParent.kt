package com.blogspot.soyamr.covidwonderer

import android.content.Context
import android.graphics.Bitmap
import com.blogspot.soyamr.covidwonderer.elements.house.Room

interface ViewParent {
    fun changeBackground(room: Room)
    fun getContext(): Context
    fun getRoomBitmap(roomID: Int): Bitmap?
    fun addButtonBookShelf()
    fun initailizeBalaconButtons()
    fun addPuzzleButton()
    fun removeButtons()
    fun startPokimonGame()
    fun startRaceGame()
    fun startWangGame()
//    fun addTIKTOKTOEButton()

}