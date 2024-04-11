package classes

import kotlin.random.Random

//You can choose any class name you want, but don't use Kotlin keywords as the class name (for example, fun).

//The class name is written in PascalCase, so each word starts with a capital letter and there are no spaces between them.

//Parts of a class:
//Properties: Son variables que especifican los atributos de los objetos de la clase.
//Methods: They are functions that contain the behaviors and actions of the class.
//Constructor: A special function that creates instances of the class throughout the program in which it is defined.


class Book(
    val title: String,
    val numPages: Int
) {

    fun readPages(numMax: Int): Int{
        return (0..numMax).random()
    }

}