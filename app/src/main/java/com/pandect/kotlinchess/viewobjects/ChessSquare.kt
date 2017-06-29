package com.pandect.kotlinchess.viewobjects

/**
 * Created by PROFESSORCORE on 6/22/17.
 */

class ChessSquare (val color : SquareColor) {

    var hasPiece : Boolean = false

    companion object SquareColor {
        fun BLACK() : String = "#000000"
        fun WHITE() : String = "#FFFFFF"
    }

    
}