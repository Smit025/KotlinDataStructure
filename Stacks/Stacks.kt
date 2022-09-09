package Stacks

interface Stacks<Elements> {
    fun pop(): Elements?
    fun push(element: Elements)
}