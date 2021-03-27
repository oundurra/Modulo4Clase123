fun main(parametro: Array<String>) {
    var edad:Int
    edad = 41

    val nombre:String
    nombre = "Oscar"

    val sueldo:Double
    sueldo = 20000000.0

    val temperatura:Float
    temperatura = 23.5f

    edad = edad * 2

    //println("edad $edad $temperatura $nombre")
    //proyecto2(edad)
    //proyecto3()
    //proyecto4()
    clase4()
}

fun suma(num1:Int, num2:Int): Int {
    return num1+num2
}

fun proyecto2(edad:Int) {
    System.out.println(suma(edad,20))
}

fun proyecto3() {
    val lado = 50
    val perimetro = lado * 4
    val superficie = lado * lado
    println("El perímetro de un cuadrado de lado $lado es $perimetro y su superficie es $superficie")
}

fun proyecto4() {
    val peso1 = 12.4f
    val peso2 = 30f
    val peso3 = 100.45f
    val promedio = (peso1 + peso2 + peso3) / 3
    println("El promedio de los tres pesos de personas es $promedio")
}

fun clase4() {
    var num1: Int;
    var num2: Int;
    var input: String?

    num1=0
    print("Ingrese numero 1: ");
    input = readLine()

    if (!input.isNullOrEmpty()) {
        num1 = input.toInt()
    }

    print("Ingrese numero 2: ");
    num2 = readLine()!!.toInt();
    println("La suma es: " + (num1+num2));
}

//NullPointerException