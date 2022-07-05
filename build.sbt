ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "scala-json-schema-example",
    scalacOptions ++= Seq("-Ymacro-annotations"),
    libraryDependencies ++= Seq(
      "com.github.andyglow" %% "scala-jsonschema" % "0.7.8",
      "com.github.andyglow" %% "scala-jsonschema-core" % "0.7.8", // <-- transitive
      "com.github.andyglow" %% "scala-jsonschema-macros" % "0.7.8" % Provided, // <-- transitive
      // json bridge. pick one
      "com.github.andyglow" %% "scala-jsonschema-play-json" % "0.7.8", // <-- optional
      "com.github.andyglow" %% "scala-jsonschema-circe-json" % "0.7.8", // <-- optional
      // joda-time support
      "com.github.andyglow" %% "scala-jsonschema-joda-time" % "0.7.8", // <-- optional
      "com.github.andyglow" %% "scala-jsonschema-cats" % "0.7.8", // <-- optional
      "com.github.andyglow" %% "scala-jsonschema-refined" % "0.7.8", // <-- optional
      "com.github.andyglow" %% "scala-jsonschema-enumeratum" % "0.7.8", // <-- optional
      "com.github.andyglow" %% "scala-jsonschema-parser" % "0.7.8", // <-- optional
      // play-json
      "com.typesafe.play" %% "play-json" % "2.8.2",
      "io.circe" %% "circe-core" % "0.14.1",
      "io.circe" %% "circe-generic" % "0.14.1",
      "io.circe" %% "circe-generic-extras" % "0.14.1",
      "io.circe" %% "circe-parser" % "0.14.1"
    )
  )
