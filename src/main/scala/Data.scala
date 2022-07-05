import io.circe.generic.extras.ConfiguredJsonCodec
import io.circe.generic.extras._

@ConfiguredJsonCodec
case class Data(
    fieldName1: String,
    fieldName2: String,
    itMustBeVeryLongFieldName1: String
)

object Data {

  implicit val configuration: Configuration =
    Configuration.default.withSnakeCaseMemberNames
}
