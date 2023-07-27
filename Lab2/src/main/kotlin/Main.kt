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
                println("Eligio 1")
            }
            "2" -> {
                println("Eligio 2")
            }
            "3" -> {
                println("Eligio 3")
            }
            "4" -> {
                println("Eligio 4")
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

