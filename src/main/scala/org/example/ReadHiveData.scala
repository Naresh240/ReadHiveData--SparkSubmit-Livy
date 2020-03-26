package org.example
import org.apache.spark.sql.SparkSession

object ReadHiveData {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local[*]")
      .appName("Read data from Hive")
      .enableHiveSupport()
      .getOrCreate()
    val employeeData = spark.sql("select * from employee")
    employeeData.show
  }
}
