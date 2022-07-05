import play.api.libs.json._
import play.api.libs.json.JsonNaming.SnakeCase
import play.api.libs.json.JsonConfiguration.Aux
import com.github.andyglow.jsonschema.AsPlay._
import json.schema.Version.Draft07
import json.{Json => JsonSchema}

object PlayExample {

  implicit val config: Aux[Json.MacroOptions] = JsonConfiguration(SnakeCase)

  implicit val dataReads: Reads[Data] = Json.reads[Data]
  implicit val dataWrites: Writes[Data] = Json.writes[Data]

  val dataObject: String =
    Json.prettyPrint(
      Json.toJson(Data("some value 1", "some value 2", "some value 3"))
    )
  val schema: String =
    Json.prettyPrint(JsonSchema.schema[Data].asPlay(Draft07("/schemas/data")))

}
