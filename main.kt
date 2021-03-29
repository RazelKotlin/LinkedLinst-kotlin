fun main() {
	val list = LinkedList<Int>()
	for (i in 10 downTo 0){
		list.push(i)
	}
	for (g in 11 .. 20){
		list.append(g)
	}
	println(list)
}