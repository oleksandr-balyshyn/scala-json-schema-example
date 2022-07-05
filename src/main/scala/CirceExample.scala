import com.github.andyglow.jsonschema.AsCirce._
import json.{Json => JsonSchema}
import io.circe.syntax._
import json.schema.Version.Draft07

object CirceExample {

  val dataObject: String =
    Data("some value 1", "some value 2", "some value 3").asJson.spaces2

  val schema: String =
    JsonSchema.schema[Data].asCirce(Draft07("/schemas/data")).spaces4

}
