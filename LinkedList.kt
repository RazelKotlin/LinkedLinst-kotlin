class LinkedList<T> {
	private var head: Node<T>? = null
	private var tail: Node<T>? = null
	var size = 0
	fun isEmpty(): Boolean = size == 0
	override fun toString(): String {
		return if (isEmpty()) {
			"Empty list"
		} else {
			head.toString()
		}
	}
	// Adds a value at the front of the list.
	fun push(value: T): LinkedList<T> {
		head = Node(value = value, next = head)
		if (tail == null) {
			tail = head
		}
		size++
		return this
	}
	// Adds a value at the end of the list
	fun append(value: T) : LinkedList<T> {
		// Check empty list and create a node
		if (isEmpty()) {
			push(value)
		}
		tail?.next = Node(value)
		tail = tail?.next
		size++
		return this
	}

}