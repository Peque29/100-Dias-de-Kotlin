/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

// FIRST POINT

// https://kotlinlang.org/


// SECOND POINT

// Comment in one line

/*
* Multiple Lines
* Comments
*/

// THIRD POINT
fun main() {

    val myFistVal = 1
    var myFirstVar = 2

// FOURTH POINT

    // Types
    val aByte: Byte = 127
    val aShort: Short = 32767
    val aInt: Int = 2147483647
    val aLong: Long = 9223372036854775807
    val aFloat = 1.11111111f
    val aDouble = 1.1111111111111110
    val myTrue = true
    val myFalse = false
    val boolNull: Boolean? = null
    val aChar = 'a'
    val aString = "(°-°)"
    val anArray = arrayOf("a", "b", "c")

    //  Non Negative
    var nonNegativeByte : UByte = 1U
    var nonNegativeShort : UShort = 2U
    var nonNegativeInt : UInt = 3U
    var nonNegativeLong : ULong = 4UL

// FIFTH POINT
    println("Hello Kotlin")
}