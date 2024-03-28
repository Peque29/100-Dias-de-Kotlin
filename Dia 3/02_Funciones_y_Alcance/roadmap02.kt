package com.example.roadmap

/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
 */

fun main() {
    function()
    functionWithParameter()
    functionWithParameterAndReturn()
    println("Fuction iquals $a")
    functionVararg("hi", "hello")
    println(singleExpressionFun())
    println(number(4))
    println(recursive())
    println(nestedFunction())
}

// Function without parameters
fun function() {
    println("Function without parameters")
}

// Fuction with parameters
fun functionWithParameter(a: Int = 1, b: String = "b") {
    println("Function with parameters $a and $b")
}

// Fuction with return
fun functionWithParameterAndReturn(a: Int = 1, b: Int = 1): Int {
    return a + b
}

val a = functionWithParameterAndReturn()

// Function with multiple parameters
fun functionVararg(vararg strings: String) {
    println("Function with multiple parameters")
    println(strings)
}

// Single Expression Function
fun singleExpressionFun(x: Int = 4): Int = x * 4

// Lambda Expression Syntax

val number: (Int) -> Int = { param: Int -> 2 * param }

// Recursive Function
fun recursive(num: Int = 0): Int {
    return if (num == 0) {
        1
    } else {
        num * recursive(num - 1)
    }
}

// Nested Function
fun nestedFunction(x: Int = 5): Int {
    fun fun1():Int{
        return x + 1
    }
    fun fun2():Int{
        return fun1() - 1
    }
    return fun2()
}

