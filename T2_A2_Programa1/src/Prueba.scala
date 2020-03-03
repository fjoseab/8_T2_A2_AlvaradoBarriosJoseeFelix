

object Prueba {
  
  
  def main(args: Array[String]): Unit = {
    var cal = Array(Array(90,80,90,100,80,100),
                    Array(90,80,90,100,80,100),
                    Array(90,80,90,100,80,100),
                    Array(90,80,90,100,80,100))
    
    var promP=0.0
    var p1=0
    var p2=0
    var p3=0
    var p4=0
    var p5=0
    var p6=0
    var cM=0
    for(e <- cal){
      for(f<-e){
        cM+=1
        promP+=f
      }
      println("Promedio por parcial parcial: " +promP/cM)
      promP=0.0
      cM=0
    }
    
    for(x <- 0 to cal.length-1){
      p1+=cal(x)(0)
      p2+=cal(x)(1)
      p3+=cal(x)(2)
      p4+=cal(x)(3)
      p5+=cal(x)(4)
      p6+=cal(x)(5)
    }
    println("Promedio materia 1: " +p1/4)
    println("Promedio materia 2: " +p2/4)
    println("Promedio materia 3: " +p3/4)
    println("Promedio materia 4: " +p4/4)
    println("Promedio materia 5: " +p5/4)
    println("Promedio materia 6: " +p6/4)
    
  }
}