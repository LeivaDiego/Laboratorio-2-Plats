enum class State {Activo,Pendiente,Inactivo}
class PerfilUsuario(
    var id: Int,
    var name: String,
    var lastname: String,
    var url: String,
    var age: Int,
    var email: String,
    var bio: String,
    var state: State,
    var hobbies: MutableList<Hobby> = mutableListOf()
) {
    fun AgregarHobby(hobby: Hobby){
        hobbies.add(hobby)
    }
}