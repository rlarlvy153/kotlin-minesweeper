package view

import domain.BoardInfo
import domain.ItemType

object PrintView {
    private const val MESSAGE_FOR_HEIGHT = "높이를 입력하세요"
    private const val MESSAGE_FOR_WIDTH = "너비를 입력하세요"
    private const val MESSAGE_FOR_MINE = "지뢰는 몇개 인가요?"
    private const val MINE_CHAR = "X"
    private const val NORMAL_CHAR = "O"
    private const val BLANK = " "

    fun printHeightMessage() {
        println(MESSAGE_FOR_HEIGHT)
    }

    fun printWidthMessage() {
        println(MESSAGE_FOR_WIDTH)
    }

    fun printMineMessage() {
        println(MESSAGE_FOR_MINE)
    }

    fun printMineBoard(boardInfo: BoardInfo) {
        repeat(boardInfo.height) { height ->
            printRowInfo(boardInfo, height)

            println()
        }
    }

    private fun printRowInfo(boardInfo: BoardInfo, row: Int) {
        repeat(boardInfo.width) {
            printMineOrNormal(boardInfo.isMineAt(row, it))

            print(BLANK)
        }
    }

    private fun printMineOrNormal(isMine: Boolean) {
        print(ItemType.getDisplay(isMine))
    }
}