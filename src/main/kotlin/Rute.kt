open class Rute (x: Int, y: Int, lab: Labyrint){

    var x: Int = x
    var y: Int = y
    var lab: Labyrint = lab

    var nord: Rute? = null
    var sør: Rute? = null
    var øst: Rute? = null
    var vest: Rute? = null

    var character: Char? = null

    fun getCharecter(): Char? {
        return character
    }

    /*
    hentHvite()
    */

    /*
    settAutoNaboer()
    */

    /*
    hentNaboer()
    */

    /*
    hentrute()
    */

    override fun toString(): String {
        return "Rute at: (" + x + ", " + y + ")"
    }




}