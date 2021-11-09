package ml.lsdp

import org.apache.spark.{SparkConf, SparkContext}
import org.slf4j.LoggerFactory
// Why that file is in test? (Think about dependencies)
object SparkDemo extends App {
    // What does local[*] mean
  val log = LoggerFactory.getLogger(getClass)
    val sparkConf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("SparkStart")
      .set("spark.app.id", "SparkStart")
    val ctx = new SparkContext(sparkConf)

    val out=ctx.parallelize((1 to 100))
      .flatMap(_=>(1 to 100).iterator)
      .map(_*10)
      .reduce((a,b)=>a+b)

    log.error(s"Result: ${out}");
    ctx.stop()
}
