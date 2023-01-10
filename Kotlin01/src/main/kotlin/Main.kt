import javafx.beans.NamedArg
import java.lang.NullPointerException

/*
Primera Clase Variables
//Las constantes simpre van definidas fuera de cualquier funcion
//Esta constante jamas cambiara su valor despues de ser inicializada
const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    //Asi declaramos variables en kotlin
    //Var: Palabra reservada para declarar variables
    //Orden Var NombreDeLaVariable : TipoDeDato = ValorDeLaVariable
    //var dinero : Int = 10
    //Podremos evitar el Int ya que el mismo sistema ve el 10 y sabe que es entero

    var dinero = 10 //La variable vale 10
    println(dinero) //Imprimimos el valor
    dinero = 5  //Podremos asignarle otro valor a la variable
    println(dinero) //Imprimimos el valor

    //Val es una variable de solo lectura osea que despues de asignarle el valor no podre cambiarselo

    val nombre = "Maria"
    println(nombre)

    println(PI) //Podemos imprimir la constante dentro de nuestra funcion Recordando los scope globales y locales

}
*/

/*Segunda Clase tipos de variables

 //Tipos de variables
fun main(args: Array<String>) {
    //Booleanos
    //val boolean : Boolean = true - val boolean = true
     val boolean = true

     //El Tipo long tiene capacidad para numeros extremadamente grandes
     // val numeroLargo : Long = 3L - val numeroLargo = 3L
     val numeroLargo = 3L

     //El tipo Double es para definir numeros decimales
     //val double : Double = 2.7542 - val double = 2.7542
     val double = 2.7542

     //Los valoress flotantes realmente se usan para cuadrar la luminosidad de un android
     //val float : Float = 1.1f  -  val float = 1.1f
     val float = 1.1f
    // println(float)
     //------------------------------------------------------------------
     //Ejemplos rapidos
     //resta Funcion minus

     val primerValor = 20
     val segundoValor = 10
     var tercerValor = primerValor.minus(segundoValor)
     println(tercerValor)

     //aunque no es necesario usar esas funciones podemos usar simbologia

     tercerValor = primerValor - segundoValor
     println(tercerValor)

     //----------------------------------------------------------------
     val apellido = "Santos"
     val nombre = "Carlos"
     var nombreCompleto = nombre + apellido // Nos permite concatenar strings
     println(nombreCompleto) //La respuesra sera CarlosSantos como los separamos, facil un string vacio
      nombreCompleto = nombre +" "+ apellido //Nos sugiere suarlo como un template
      println(nombreCompleto) //La respuesta seria Carlos Santos

      nombreCompleto = "Mi nombre es: $nombre $apellido"  //$ Asi agregamos las variables dentro de un string, Interpolacion o templates
      println(nombreCompleto)
    }
    */

/*Tercera Clase apoyo

 // Modificadores

fun main(args: Array<String>) {

 Expresion | Función   | Se traduce a
 a + b     |   plus    |a.plus(b)
 a - b     |   minus   |a.minus(b)
 a * b     |   times   |a.times(b)
 a / b     |   div     |a.div(b)
 a % b     |   mod     |a.mod(b)
 ------------------------------------
 -------------------------------------
  Expresion | Función   | Se traduce a
a++         | c = a++   |  inc(a) Incrementador
a--         | c = a--   |  dec(a)
a > b       | c = a > b |  (c.compareTo(a)>b) mayor que
a < b       | c = a < b |  compareTo(b) menor que
a >= b      | c = a >= b|  compareTo(b) mayor o igual
a <= b      | c = a <= b|  compareTo(b) menor o igual
a != b      | c = a != b|  equals(b) Diferente o igual arroja un booleano


 }
*/

/*Cuarta clase if
// Estructuras de control: if

fun main(args: Array<String>) {

 var nombre = "Vany"

 if(nombre.isNotEmpty()){
  println("Cuantas letras tienen nuestra variable: ${nombre.length}")
 } else {
  println("Error, la variable no se a iniciado o esta vacia")
 }
//------------------------------------------------------------------------------
 //Ahora probemos cuando este vacia

  nombre = ""

 if(nombre.isNotEmpty()){
  println("Cuantas letras tienen nuestra variable: ${nombre.length}")
 } else {
  println("Error, la variable no se a iniciado o esta vacia")
 }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
 //Como hacer un codigo e una sola linea

 nombre = "Vanessa"

 if(nombre.isNotEmpty()) println("Cuantas letras tienen nuestra variable: ${nombre.length}") else println("Error, la variable no se a iniciado o esta vacia")

 //------------------------------------------------------------------------------------------

 val mensaje : String = if(nombre.length > 4) "Tu nombre es largo" else "Tienes un nombre corto"

 println(mensaje) //Le definimos el valor a una variable con una funcion dependiendo de otra variable

 //----------------------------------------------------------------------------------------------------------------------

 //else if

 nombre = ""
  var mensajes : String = if (nombre.length>4){
   "Tu nombre es muy largooo"
 }else if(nombre.isEmpty()){
    "El nombre esta vacio"
  }else{
  "Tienes un nombre corto"
  }
 println(mensajes)
}*/

/* Quinta Clase when
// Estructuras de Control: when

fun main(args: Array<String>) {

  //Cuando cierta variable ejecute un codigo es como el switch de java
 var nombreColor = "Amarillo"
 nombreColor = "Carmesi"

 when(nombreColor){

   "Amarillo" -> {println("El amarillo es el color e la alegria")} //se puede usar llaves o no

   "Rojo","Carmesi" -> println("simboliza el calor") // podemos usar dos mismos casos en la misma ejecucion


  else -> println("Error no tengo informacion de ese color") //else es como el default
 }
//-------------------------Otro Ejemplo----------------------------------------------------------------------------------


 val code = 600
 when (code){
  in 200..299 -> println(" Todo ha ido bien") // este es un rango como un for donde debe parar y donde debe avanzar
  in 400 .. 500 -> println("Algo ha fallado")
  else -> println("Codigo desconocido algo ha fallado")

 }

 //-------------------------Otro Ejemplo----------------------------------------------------------------------------------

 val tallaDeZapatos = 800
 val mensaje = when(tallaDeZapatos) {
  39,43 -> "Tenemos disponible"
  42,44 -> "Casi no nos quedan"
  45 -> "No tenemos disponible"
  else -> {"Estos zapatos solo tienen tallas 39, 43, 42, 44"}
 }
 println(mensaje)

}
*/

/* Sexta Clase while y do
// Bucles: While y Do While

fun main(args: Array<String>){
    var contador = 10
    while (contador >0){
        println("El valor del contador es $contador")
        contador--
    }

    //Do while
    do { // es un accion
        println("Generando numero aleatorio ...") //imprimimos la accion
        val numeroAleatorio = (0..100).random() //Usamos .. para definir un rango y el ramdom es que nos seleccione un numero de ese rango
        println("el numero generado es $numeroAleatorio") //Imprimimos el valor
    } while (numeroAleatorio > 50) //Mientras el numero sea mayor que 50 se repetira la accion hasta que no sea mayor que 50

}
*/

/*Septima Clase for, forEach, map
//Ciclos
fun main(args: Array<String>){
    //for
    //listOf es como una lista en java or List
    val listaDeFurtas: List<String> = listOf("Manzana","Pera","Frambuesa","Durazno")
    for(fruta in listaDeFurtas) println("Hoy voy a comerme una fruta llamada: $fruta")

    //ForEach es una funcion anonima
    listaDeFurtas.forEach { fruta -> println("Hoy voy a comerme una fruta nueva llamada: $fruta") }


    //map
    val caracteresDeFruta: List<Int> = listaDeFurtas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)
}
*/

/*Octava Clase  nulos, Double bang

// nulos, Double bang

fun main(args: Array<String>){
    var segundoNombre : String? = "Antonio" //? quiere decir que ese tipo de dato puede ser null
    segundoNombre = null  // Sin ? no podriamos inicializar esa variable en null, el compilador tira error
    println(segundoNombre)
    println(segundoNombre?.length) //Safe call nos permite verificar si es nula y que el compilador no nos tire error

}

 */

/*Novena Clase Try Catch

// Try Catch
fun main(args: Array<String>){

    var nombre : String? = null
    //nombre!!.length  // !! Me permite ignorar el error y que compile
    //println(nombre?.length) me imprime un null sin darme error despues de la compilacion
    try {
        throw NullPointerException("Referencia nula")

    }catch (excepcion : NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error ... Cerrando aplicacion")
    }

    //-------------------Otro Ejemplo -------------------------------------------------------

    val primerValor = 100
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor} catch (exception: Exception){0} //Exception es el padre de todas las Excepciones
    println(resultado)


}

 */

/* Decima Clase Elvis operator

//Elvis operator
fun main(args: Array<String>){
    var nombre : String? = null
    val caracterDeNombre : Int = nombre?.length ?: 0 // ?: Elvis Operator nos aseguramos que si hay un error en eso nos devuelva un cero
    println(caracterDeNombre)

}

 */

/* Onceava Clase Listas

//Listas familias de las colleptions existen dos listas inmutables y las mutables
fun main(args: Array<String>){

    //Listas inmutables
    val listaDeNombre = listOf("Juan","Enrique","Camila")
    println(listaDeNombre) // a esta lista no me dejara ni agregarle o quitarle informacion
    //listaDeNombre.remove

    //-------------------------------------------------------------------------
    //Listas mutables
    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0) // sacamos el valor que esta en la posicion 0 del indice de ese array en si
    println(valorUsandoGet)

    val valorUSandoOPerador = listaVacia[0] // tambien podemos usar esto para evitar el get
    println(valorUsandoGet)

    val primerValor = listaDeNombre.firstOrNull() //nos imprime el primer valor y si es nullo nos salta la exception y tira nulo
    println(primerValor)

    listaVacia.removeAt(0) // Eliminamos el valor por su posicion
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf{ caracteres -> caracteres.length > 3 }
    println(listaVacia)

    //como declaramos un array

    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array $myArray") //Nuestro array [Ljava.lang.Integer;@17a7cec2 esta es su respuesta
    //Para solucionar esto imprimimos el array como una lista asi no habra problema al querer visializar los datos
    println("Nuestro array ${myArray.toList()}") //Nuestro array [1, 2, 3, 4] esta seria la respuesta



}

 */

/*Doceava Clase ordenar listas con las funciones

//Como ordenar listas con las funciones que tiene Kotlin

fun main(args: Array<String>) {
    val numeroDeLoteria = listOf(66, 22, 43, 56, 78, 11)

    val numerosSorted = numeroDeLoteria.sorted() // con la funcion sorted() nos permite ordenar listas
    println(numerosSorted) //[11, 22, 43, 56, 66, 78]

    val numerosDeLoteriaDescendientes = numeroDeLoteria.sortedDescending() //Nos ordena los numero descendientes
    println(numerosDeLoteriaDescendientes) //[78, 66, 56, 43, 22, 11]

    val ordenarPorMultiplos =
        numeroDeLoteria.sortedBy { numero -> numero < 50 } // realmente es ordenar por una condicion
    println(ordenarPorMultiplos) //[66, 56, 78, 22, 43, 11]

    val numerosAleatorios = numeroDeLoteria.shuffled() // genera de forma aleatoria el orden de esta lista
    println(numerosAleatorios) //Son aleatorios

    val numeroEnReversa = numeroDeLoteria.reversed() // NOs toma la lista original y los ordena en reversa
    println(numeroEnReversa) //[11, 78, 56, 43, 22, 66]

    val mensajesDeNumeros = numeroDeLoteria.map { numero -> "Tu numero de loteria es $numero" } // nos itera la lista osea la recorre y por cada numero quiero que me imprima ese mensaje
    println(mensajesDeNumeros) // [Tu numero de loteria es 66, Tu numero de loteria es 22, Tu numero de loteria es 43, Tu numero de loteria es 56, Tu numero de loteria es 78, Tu numero de loteria es 11]

    val numeroFiltrados = numeroDeLoteria.filter { numero -> numero > 50} //Nos filtrara con una condicion en este caso numero mayores de 50
    println(numeroFiltrados)//[66, 56, 78]

}

 */

/*Treceava Clase Maps

//Maps
fun main(args: Array<String>){
    //Maps Inmutables -- esto es lo mas cercano a los objetos de javascript
    val edadSUperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 123,
    )
    println(edadSUperHeroes)  //{Ironman=35, Spiderman=23, Capitan America=123}

    // Maps mutables
    val edadSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 123,
    )
    println(edadSuperHeroesMutable) //{Ironman=35, Spiderman=23, Capitan America=123}

    //Como agregar super heroes
    edadSuperHeroesMutable.put("Wolwerine", 45)
    println(edadSuperHeroesMutable)


    //Como Seria agregar en una asignacion si usar el put
    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)

    //Como obtener un valor del map
    val edadIroman = edadSuperHeroesMutable["Ironman"]
    println("Iroman Tiene $edadIroman")

    //Como eliminamos un valor
    edadSuperHeroesMutable.remove("Wolwerine") // se necesita la key para poder eliminarlo
    println(edadSuperHeroesMutable)

    //Como sabemos que clase de keys tiene?
    println(edadSuperHeroesMutable.keys)
    //Y como conocer solo los valores sin las keys
    println(edadSuperHeroesMutable.values)
}

 */

/*Catorceava Clase Sets

//Sets
fun main(args: Array<String>){
    //Sets Inmutables
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u") //Solo consideran las primeras variables, osea no repite variables
    println(vocalesRepetidas)//[a, e, i, o, u]

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println(numerosFavoritos) //[1, 2, 3, 4, 5] como vemos solo imprime un 5
    println() //darle un espacio para la impresion
    println(numerosFavoritos)
    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet = numerosFavoritos.firstOrNull(){ numero -> numero>2} // nos tomara el primero de esa condicion
    println(valorDelSet)
}

 */

/*Quinceava clase tipos de Funciones

//funciones
fun main(args: Array<String>){
    //Ejemplo de una funcion
    //fun es la palabra reservada para indicar que es una funcion
    // suma es el nombre de nuestra funcion
    //(Aca van los parametros y es lo contrario a como se definen en java)
    //(Primero va el nombre del parametro : los dos puntos indica el tipo de parametro que sera)
    // y al final añademos : Int {  esto nos dice que el valor que debemos retornar es entero
    //Y por ultimo el codigo del procedimiento que llevara esta funcion en este caso una suma

    fun suma(primerValor: Int, segundoValor: Int ): Int{
        return primerValor + segundoValor
    }
    println(suma(4,3)) //7

    //Hay funciones unit que no deben retornar algo
    //Unit = void

    fun imprimirNombre(nombre: String, apellido: String){
        print("Mi nombre es : $nombre y mi apellido es: $apellido")
    }

    imprimirNombre("Carlos", "Santos")


}

 */

/*Diesciseisava Clase funciones de extensión

//Funciones y funciones de extensión

fun main(args: Array<String>){
    val fraseAleatoria = "Nunca se deja de estudiar".ranmdomCase() //La frase que queremos en mayuscula o minuscula
    imprimirFrase(fraseAleatoria) //metemos una funcion dentro de otra
}

fun imprimirFrase(frase : String){
    println("tu frase es: $frase")  //Creamos una funcion unit para imprimir la frase
}

/*
fun ranmdomCase(frase: String): String{
    val numeroAleatorio = 0..99 //ponemos un rango especifico
    val resultadoAleatorio = numeroAleatorio.random() //tomamos un numero aleatorio

    return if (resultadoAleatorio.rem(2) == 0){ //rem es para que nos tome el residuo de una division
        return frase.uppercase() //si es 0 la frase ira en mayuscula
    } else{
        return  frase.lowercase() //de lo contrario ira en minuscula
    }
}

 */

//Como seria con extension
fun String.ranmdomCase(): String{
    val numeroAleatorio = 0..99 //ponemos un rango especifico
    val resultadoAleatorio = numeroAleatorio.random() //tomamos un numero aleatorio

    return if (resultadoAleatorio.rem(2) == 0){ //rem es para que nos tome el residuo de una division
        return this.uppercase() //si es 0 la frase ira en mayuscula
    } else{
        return  this.lowercase() //de lo contrario ira en minuscula
    }
}

 */

/*Diesisieteava Clase Tipos de parámetros en las funciones

//Tipos de parámetros en las funciones

fun main(args: Array<String>){
    imprimirNombre(nombre = "Carlos", segundoNombre = "Alberto", apellido = "Santos ") //Podemos asignarle las keys que tenemos asi identificamos cual es cual es para buena practica funciona sin eso
}

fun imprimirNombre(nombre: String, segundoNombre: String, apellido: String){
    //println("Mi nombre es $nombre y mi apellido es $apellido")
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}


 */

/*Diesiochoava Clase Lambdas

//Lambdas son funciones anonimas
fun main(args: Array<String>){
    val myLambda : (String) -> Int = { valor -> valor.length }
    val lambdaEjecutada = myLambda("Hola mundo") //asi la ejecutamos
    println(lambdaEjecutada) // y asi la imprimimos 10

    val saludos = listOf("Hello","Hola","Ciao")

        val longitudDeSaludos =  saludos.map(myLambda)

    println(longitudDeSaludos)

}

 */

/*Diesinueveava Clase High Order functions

//High Order functions

fun main(args: Array<String>){
    val largoDelValorInicial = superFunction(valorInicial = "Hola!", block = { valor -> valor.length})
    println(largoDelValorInicial)

    val lambda = funcionInceorion(nombre = "Enrique")
    //println(lambda()) --es el mismo resultado
    val valorLambda: String = lambda()
    println(valorLambda)
}

fun superFunction( valorInicial : String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

fun funcionInceorion(nombre:String): () -> String{
    return {
        "Hola desde la lambda $nombre"
    }
}

 */

/*Veinteava Clase Let

//Let

fun main(args: Array<String>){
    var nombre : String? = null
    nombre?.let {
            valor -> println("El nombre no es nulo es $valor")
    }
    nombre = "carlos"
    nombre.let { valor -> println("El nombre no es nulo es $valor") }
}

 */

/*Veinteunava Clase With

//With

fun main(args: Array<String>){
     val colores = listOf("Azul","Amarillo","Rojo")
    with(colores) {
        println("Nuestros colores son $this") //ese $this se refiere a la misma lista de colores  || Nuestros colores son [Azul, Amarillo, Rojo]
        println("Esta lista tiene una cantidad de colores de $size") // nos dice el tamaño del array y cuantos valores tiene
    }
}

 */

/* Veintidosava Clase Run

//Run

fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4A", "Xioami note 10","Samsung Galaxy A51")
        .run {
            removeIf {movil -> movil.contains("Google") } //Removeif elimina elementos con cierta condicion y el contains busca algo que tenga esos caracteres
            this
        }
    println(moviles) //[Xioami note 10, Samsung Galaxy A51]
}

 */

/*Veintitresava Clase Apply

//Apply




fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4A", "Xioami note 10","Samsung Galaxy A51")
        .apply { removeIf{ movil -> movil.contains("Google")} } // hace lo mismo que el ran pero no es necesario definir el this
    println(moviles)

    val colores : MutableList<String>? = mutableListOf("Amarillo","Azul","Rojo")
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }

}

 */

/*Veinticuatroava Clase Also

//Also

fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4A", "Xioami note 10","Samsung Galaxy A51").also {
        lista -> println("El valor original de la lista es $lista")
    }.asReversed()
    println(moviles)


}

 */

/*Proyecto*/

//Creando el menú de nuestra bola mágica
// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "\uD83E\uDD14"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main(args: Array<String>){
    println("Hola soy tu bola  magica creada en kotlin.")
    println("¿Cual de estas opciones deseas realizar?")
    println("1. Realizar una pregunta")
    println("2. Revisar todas las respuestas")
    println("3. Salir")

    val valorIngresado = readLine() //Nos permite leer por consola el valor

    when(valorIngresado){
        "1" -> realizarPregunta()
        "2" -> revisarRespuesta()
        "3" -> salir()
        else ->  mostrarError()

    }

}

fun mostrarError() {
    println("Parece que has elegido una opcion que no existe en el menu")
}

fun salir() {
    println("Hast Luego")
}

fun revisarRespuesta() {
    println("Selecciona una opcion")
    println("1. Revisar todas las respuestas")
    println("2. Revisar solo las respuestas afirmativas")
    println("3. Revisar solo las respuestas dudosas")
    println("4. Revisar solo las respuestas negativas")
    val opcionIngresada = readLine()
    when(opcionIngresada){
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_DUDOSA)
        "4" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_NEGATIVA)

    }
}

fun mostrarRespuestasPorTipo(tipoDeRespuesta : String = "TODOS") {
    when(tipoDeRespuesta) {
        "TODOS" -> respuestas.keys.forEach{ respuesta -> println(respuesta) }
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
            .also { respuestasPositivas -> println(respuestasPositivas.keys) }

        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
            .also { respuestasNegativas -> println(respuestasNegativas.keys) }

        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
            .also { respuestasDudosas -> println(respuestasDudosas.keys) }
    }
}

fun realizarPregunta(){
    println("Que pregunta deseas realizar?")
    readLine()
    println("Asi que esa era tu pregunta....")
    println("La respuesta a eso es...")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}





