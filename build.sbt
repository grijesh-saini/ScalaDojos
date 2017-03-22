val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1" % Test
val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.13.4" % Test

lazy val commonSettings = Seq(
  organization := "com.sarg.dojos",
  version := "0.1.0",
  scalaVersion := "2.12.1"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "Scala dojos seed project",
    libraryDependencies ++= Seq(scalaTest, scalaCheck)
  )
