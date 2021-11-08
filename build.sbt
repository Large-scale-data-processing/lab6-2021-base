name := "spark-batch-processing"

version := "1.0"

scalaVersion := "2.13.1"

val sparkVersion = "3.2.0"

// Why the dependnecies are "provided"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"

