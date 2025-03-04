import com.github.music.of.the.ainur.almaren.builder.Core.Implicit
import com.github.music.of.the.ainur.almaren.Almaren
import org.apache.spark.sql.{DataFrame, SaveMode}
import com.github.music.of.the.ainur.quenya.QuenyaDSL
import com.github.music.of.the.ainur.almaren.http.HTTPConn.HTTPImplicit
import org.apache.spark.sql.Row
import org.apache.spark.sql.types.{MapType, StringType, StructField, StructType}
import scala.collection.JavaConverters.asScalaIteratorConverter

import spark.implicits._

val almaren = Almaren("App Name")
