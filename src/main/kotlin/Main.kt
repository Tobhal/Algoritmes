import algorithms.unbalanced.tree.BTree

fun main() {
    val root = BTree<Int>()
    root.insert(listOf(5, 15, 2, 1, 3, 10, 12))

    println(root.contains(4))

}
