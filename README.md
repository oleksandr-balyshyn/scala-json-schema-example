# scala-json-schema-example
The example of the unexpected behavior of scala-jsonschema library  

Circe Example
```json
{
    "$id" : "/schemas/data",
    "properties" : {
        "fieldName1" : {
            "type" : "string"
        },
        "fieldName2" : {
            "type" : "string"
        },
        "itMustBeVeryLongFieldName1" : {
            "type" : "string"
        }
    },
    "additionalProperties" : false,
    "$schema" : "http://json-schema.org/draft-07/schema#",
    "type" : "object",
    "required" : [
        "fieldName1",
        "fieldName2",
        "itMustBeVeryLongFieldName1"
    ]
}
```
```json
{
  "field_name1" : "some value 1",
  "field_name2" : "some value 2",
  "it_must_be_very_long_field_name1" : "some value 3"
}
```
PlayJson example
```json
{
  "$id" : "/schemas/data",
  "properties" : {
    "fieldName1" : {
      "type" : "string"
    },
    "fieldName2" : {
      "type" : "string"
    },
    "itMustBeVeryLongFieldName1" : {
      "type" : "string"
    }
  },
  "additionalProperties" : false,
  "$schema" : "http://json-schema.org/draft-07/schema#",
  "type" : "object",
  "required" : [ "fieldName1", "fieldName2", "itMustBeVeryLongFieldName1" ]
}
```
```json
{
  "field_name1" : "some value 1",
  "field_name2" : "some value 2",
  "it_must_be_very_long_field_name1" : "some value 3"
}
```
