object Main extends App
{
  def diaSemana(year: Int, month: Int, day: Int): String =
  {
    val q = day
    val m = if (month <= 2) month + 12 else month
    val y = if (month <= 2) year - 1 else year
    val K = y % 100
    val J = y / 100
    val h = (q + ((13*(m+1))/5) + K + (K/4) + (J/4) - 2*J) % 7
    val diasSemana = List("Sábado", "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes")
    diasSemana(h)
  }

  // Ejemplo 1
  val year = 2001
  val month = 9
  val day = 11
  val nombreDia = diaSemana(year, month, day)
  println(s"El $year/$month/$day es $nombreDia")

  // Ejemplo 2
  val year2 = 1994
  val month2 = 3
  val day2 = 12
  val nombreDia2 = diaSemana(year2, month2, day2)
  println(s"El $year2/$month2/$day2 es $nombreDia2")

  // Ejemplo 3
  val year3 = 2023
  val month3 = 04
  val day3 = 13
  val nombreDia3 = diaSemana(year3, month3, day3)
  println(s"El $year3/$month3/$day3 es $nombreDia3")
}
