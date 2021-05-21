
object Hello {
  def main (args : Array[String]): Unit = {

    val list2 : List[Int] = List(1,8,5,6,9,58,23,15,4)
    val names = List("joel", "ed", "chris", "maurice")
    val nums = List.range(0, 12)

    macollectionscala()
  }

  def macollectionscala() : Unit = {

    val maliste = List("jvc", "pays", "ecole")
    val maliste2 : List[String] = List("julien", "yao")
    val maliste3 : Seq[Int] = List(10, 20, 30, 70).toSeq

    val k1 = maliste.map(l => l.toUpperCase)

    val tp : Seq[String] = Seq("viviane", "stephane", "stephanie", "kouadio", "yasmine", "madou", "bienvenue")
    val tp1 : Seq[Int] = tp.map(l => l.length)
    val liste = tp.filter(_.length > 7).foreach(f => print(f + " "))

    val monmap : Map[String, String] = Map(
      "ab" -> "Abobo",
      "yop" -> "Yopougon",
      "cc" -> "Cocody",
      "mar" -> "Marcory"
    )


  }



}
