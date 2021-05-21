import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {

  def main (args : Array[String]): Unit = {
    sessionspark()
  }

  def sessionspark () : Unit = {

    System.setProperty("Hadoop.home.dir","C:\\Hadoop")
    val ss = SparkSession.builder()
      .master(master = "local[*]") // notre ordinateur est considerer comme le noeud master
      .appName(name = "Ma_premiere_application_spark")
      //.enableHiveSupport()//pour supporter les requetes Hive
      .getOrCreate()

    val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application spark. Je suis un etudiant de DATA SCIENCE heureux"))

    //rdd1.foreach(l => println(l))

    val df_1 = ss.read
      .format("csv")
      .option("InferSchema", "True") //permet de faire l'inference (type des collonne)
      .option("header", "True")
      .option("delimiter", ";")
      .csv(path = "D:\\MASTER_1_DATA_SCIENCE\\DEUXIEME_SEMESTRE_2020-2021\\HADOOP_Prof_JUVENAL\\orders_csv.csv")

    df_1.show(numRows = 10)

    df_1.printSchema()

    df_1.createOrReplaceTempView(viewName = "orders") // creation du schema de la

    ss.sql(sqlText = "select * from orders where city = 'NEWTON' ").show() // execution dune requete sql


  }

}
