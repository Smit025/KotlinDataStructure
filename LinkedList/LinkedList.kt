package LinkedList

class LinkedList<T> {

    var head: Node<T>? = null
    var tail: Node<T>? = null
    var size = 0

    private fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Is Empty"
        } else {
            head.toString()
        }
    }

    fun push(value: T): LinkedList<T> {
        var currentNode = head
        if (head == null) {
            head = Node(value = value, next = null)
        } else {
            while (currentNode?.next != null) {
                currentNode = currentNode.next
            }
            currentNode?.next = Node(value = value, next = null)
        }
        size++
        return this
    }

    fun insertAt(index: Int, value: T) {
        val node = Node(value, null)
        var i = 1
        var currentNode = head
        while (currentNode?.next != null) {
            if (index == i) {
                val temp = currentNode.next
                currentNode.next = node
                node.next = temp
            }
            i++
            currentNode = currentNode.next
        }
    }

    fun deleteAtIndex(index: Int) {

        var currentNode = head
        var prev: Node<T>? = null
        var temp: Node<T>? = null
        var i = 0
        if (currentNode == null) {
            return
        }

        if (index == 0) {
            head = currentNode.next
            return
        }

        while (currentNode?.next != null) {
            if (index == i) {
                if (currentNode.next != null) {
                    temp = currentNode.next
                } else {
                    currentNode = null
                }
                //Perform delete operation here
                prev?.next = temp
            }
            i++
            prev = currentNode
            currentNode = currentNode?.next
        }
    }

    fun removeLast() {
        var currentNode = head
        var previous: Node<T>? = null
        if (currentNode == null) {
            return
        }
        while (currentNode?.next != null) {
            previous = currentNode
            currentNode = currentNode.next
        }
        previous?.next = null
    }

    fun reverse() {
        var next: Node<T>? = null
        var prev: Node<T>? = null
        var currentNode = head
        while (currentNode != null) {
            next = currentNode.next
            currentNode.next = prev
            prev = currentNode
            currentNode = next
        }
        head = prev

    }

    fun mergeTwoLinkedList(node1: Node<T>?, node2: Node<T>?):Node<T>? {
        var head1 = node1
        var currentNode = node1
        while (currentNode?.next != null) {
            currentNode = currentNode.next
        }
        if (currentNode != null) {
            currentNode.next = node2
        }
        return head1
    }

    fun printLinkedList(node: Node<T>? = null) {

        var currentNode = node
        while (currentNode?.next != null) {

            currentNode = currentNode.next

        }

    }

}