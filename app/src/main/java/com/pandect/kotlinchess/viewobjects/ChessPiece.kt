package com.pandect.kotlinchess.viewobjects

/**
 * Created by PROFESSORCORE on 6/22/17.
 */

abstract class ChessPiece {

    class ChessPiece constructor(val name: String, val color: PieceColor)

    companion object PieceColor {
        fun BLACK() : String = "#000000"
        fun WHITE() : String = "#FFFFFF"
    }

    abstract fun canMove()
}