package LinkedList

fun main() {
    val list1 = LinkedList<Int>()
    list1.push(1).push(2).push(3).insertAt(2,7)
    var list2 = LinkedList<Int>()
    list2.push(1).push(2).push(3).insertAt(2,7)
    val list3 = LinkedList<Int>()
    print(list3.mergeTwoLinkedList(list1.head,list2.head))
   // list2.printLinkedList(list2.head)
   // println(list1)
}