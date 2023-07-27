/**
 * Programa: Manejador de perfiles de usuario
 * @author diego leiva
 * */
fun main() {


    //Perfiles precargados
    var users: MutableList<PerfilUsuario> = mutableListOf()
    users.add(PerfilUsuario(1,"Diego","Leiva","thisurl.com",22,"lei21752@uvg.edu.gt","esta es la bio", state = State.Activo))
    users.add(PerfilUsuario(2, "Maria", "Gomez", "mariaurl.com", 25, "maria123@email.com", "Hola, soy Maria", state=State.Inactivo))
    users.add(PerfilUsuario(3, "Juan", "Perez", "juanurl.com", 30, "juan45@gmail.com", "Mi nombre es Juan", state=State.Pendiente))
    users.add(PerfilUsuario(4, "Ana", "Lopez", "anaurl.com", 28, "ana_lopez@yahoo.com", "Soy Ana y me gusta la música", state=State.Activo))

    //Menu de opciones
    println("Bienvenido")
    while (true){
        println("Selecciona una opción:")
        println("1. Crear perfil")
        println("2. Buscar perfil de usuario")
        println("3. Eliminar perfil")
        println("4. Agregar Hobby")
        println("5. Salir")

        when(readln()){
            "1" -> {
                newProfile(users)
            }
            "2" -> {
                searchProfile(users)
            }
            "3" -> {
                deleteProfile(users)
            }
            "4" -> {
                addHobby(users)
            }
            "5" -> {
                println("Ha salido del programa")
                break
            }
            else -> {
                println("La opción seleccionada no existe")
            }
        }
    }
}


/**
 * Funcion que solicita la informacion del usuario y la agrega a los perfiles
 * @param profiles, el listado con todos los perfiles de usuario
 */
fun newProfile(profiles: MutableList<PerfilUsuario>) {

}


/**
 * Funcion que busca un perfil de usuario por su ID y muestra en consola toda la informacion de dicho usuario
 * @param profiles, el listado con todos los perfiles de usuario
 */
fun searchProfile(profiles: MutableList<PerfilUsuario>) {
    println("[Buscar perfil]")
    print("Ingresa ID o el nombre y apellido: ")
    val search = readlnOrNull()

    // Intenta convertir el valor de entrada del usuario a un numero entero
    // Si la conversion tiene éxito, significa que el usuario ingreso un entero, y filtra la lista de perfiles para
    // encontrar aquellos cuyo ID coincide con el numero ingresado.
    // Si la conversion falla y se devuelve null, significa que el usuario ingreso una cadena de texto, y filtra la
    // lista de perfiles para encontrar aquellos cuyo nombre y apellido coinciden con la cadena de texto ingresada
    val results = when (val toIntOrNull = search?.toIntOrNull()) {
        null -> profiles.filter { (it.name + " " + it.lastname) == search }
        else -> profiles.filter { it.id == toIntOrNull }
    }

    //Verificamos si encontro o no el perfil
    if (results.isEmpty()) {
        println("No se encontró el perfil")
    } else {
        for (user in results) {
            println("ID: ${user.id}, Nombre: ${user.name}, Apellido: ${user.lastname}, URL: ${user.url}, Edad: ${user.age}, Correo: ${user.email}, Biografia: ${user.bio}, Estado: ${user.state}, Hobbies: ${user.hobbies.joinToString(", ") { it.title }}")
        }
    }
}


/**
 * Funcion que elimina un perfil de usuario especifico por ID
 * @param profiles, el listado con todos los perfiles de usuario
 */
fun deleteProfile(profiles: MutableList<PerfilUsuario>) {

}

/**
 * Funcion que agrega un hobby nuevo a un perfil de usuario en especifico
 * @param profiles, el listado con todos los perfiles de usuario
 */
fun addHobby(profiles: MutableList<PerfilUsuario>) {

}
