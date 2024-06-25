import java.lang.Exception

class SinhVienPTIT(id: Int,  name: String, var gpa: Double, val age: Int = 10, var  diachi : String? = null){
    constructor(id: Int, name: String, gpa: Double) : this(id, name, gpa, 10)

    var id : Int = id
    var name : String = name
        set(value) {
            field = value
        }
    init {
        this.id = 2;
    }

}