import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object Prueba {
  def main(args: Array[String]): Unit = {
    println("Temperatura")
    var temp = new Array[Int](48)
    val temp1 = new ArrayBuffer[Int]()
    var hora: Int = 0
    
    for(x <- 0 to temp.length-1){
      if((x%2)==0){
        temp(x)=hora
        hora+=1
      }else{
        temp(x)=Random.nextInt(50)
      }
    }
    println()
    println("Vector llendo")
    for(g <- 0 to temp.length-1 by 2){
        print(" Hora: "+temp(g)+" Temp "+temp(g+1)+"/")
    }
    
    for(e <- 0 to temp.length-1 by 2){
      if(temp(e+1)==25){
        print(" Hora: "+temp(e)+" Temp "+temp(e+1)+"/")
        temp1.+=(temp(e))
        temp1.+=(temp(e+1))
      }
    }
    println()
    println("Nuevo vector")
    var t: Double=0.0
    for(g <- 0 to temp1.length-1 by 2){
        print(" Hora: "+temp1(g)+" Temp "+temp1(g+1)+"/")
        t+=temp1(g+1)
    }
    println("Promedio horas: "+(t)/24)
  }
}