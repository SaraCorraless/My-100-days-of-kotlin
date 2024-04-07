package classes

data class Dog(

    var name: String = "",
    var breed: String = "",
    var age: Int = 0

){
    fun givePaw(): Unit {
        println("Give a reward for giving the paw")
    }

    override fun toString(): String {
        return "My dog's name is ${this.name} and it is a ${this.breed}."
    }
}