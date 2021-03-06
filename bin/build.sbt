lazy val root = (project in file("."))
  .settings(
    name := "scala-des",

    version := "1.0",

    scalaVersion := "2.11.8",

    libraryDependencies ++= Seq(
      "commons-codec" % "commons-codec" % "1.15"
     ),

    mainClass := Some("example.Main")
)
