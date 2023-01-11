import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class Labyrint {
    /*
    Rute[][] ruter;          not sure how to write this
    */

    lateinit var ruter: Array<Array<Rute>>

    var x = 0
    var y = 0

    lateinit var åpninger: ArrayList<Rute>

    fun lesLab(fil: String){
        var lokasjon = "labyrinter/" + fil
        var file = File(lokasjon)
        try {
            val br = BufferedReader(FileReader(file))
            var antallLinjer = 0
            var line: String? = br.readLine()
            println(line)

            while(line != null){
                if (antallLinjer == 0){
                    var fordeleRogK = line.split(" ")
                    try {
                        y = fordeleRogK.get(0).toInt()
                        x = fordeleRogK.get(1).toInt()
                    }
                    catch (e: Exception){
                        println(e)
                        println("try catch i linje 34")
                    }
                    ruter = Array(y){Array(x){Rute(0,0,this)}}
                }
                println(line)
                line = br.readLine()
                var skilleruter = line?.toCharArray()

                antallLinjer += 1
            }
        }
        catch (e: Exception){
            println(e)
        }


    }


    fun tem(x: Int, y: Int){
        ruter = Array(x){Array(y){Rute(x, y, this)} }
    }

}

fun main() {
    var lab = Labyrint()
    lab.lesLab("1.in")


}