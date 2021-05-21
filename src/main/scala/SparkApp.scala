import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {

  def main (args : Array[String]): Unit = {
    sessionspark()
  }

  def sessionspark () : Unit = {

    System.setProperty("winutils","C:\\Hadoop")
    val ss = SparkSession.builder()
      .master(master = "local[*]")
      .appName(name = "Ma_premiere_application_spark")
      //.enableHiveSupport()//pour supporter les requetes Hive
      .getOrCreate()

    val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application spark. Je suis un etudiant de l'INPHB heureux"))

    rdd1.foreach(l => println(l))


  }

}
