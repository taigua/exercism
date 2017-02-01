/**
 * Created by Corwin on 2017/2/1.
 */

private data class Node<T>(val v: T, var previous: Node<T>? = null, var next: Node<T>? = null)

class Deque<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun push(v: T) {
        val node = Node(v, previous = tail, next = null)
        tail?.next = node
        tail = node
        if (head == null) head = tail
    }

    fun pop() : T {
        if (tail == null) {
            throw IllegalAccessException("Empty deque.")
        }

        val value = tail?.v
        val p = tail?.previous

        p?.next = null
        tail?.previous = null
        if (head == tail) head = null
        tail = p

        return value!!
    }

    fun unshift(v: T) {
        val node = Node(v, previous = null, next = head)
        head?.previous = node
        head = node
        if (tail == null) tail = head
    }

    fun shift() : T {
        if (head == null) {
            throw IllegalAccessException("Empty deque.")
        }

        val value = head?.v
        val n = head?.next

        n?.previous = null
        head?.next = null
        if (tail == head) tail = null
        head = n

        return value!!
    }
}
