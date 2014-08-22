scalaVersion := "2.10.3"

name := "play2-mail-plugin"

organization := "play.modules.mail"

version := "0.5-SNAPSHOT"

resolvers ++= Seq(
    "Typesafe repository snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
    "Typesafe repository releases" at "http://repo.typesafe.com/typesafe/releases/"
)

scalacOptions ++= Seq(
    "-feature",
    "-language:implicitConversions",
    "-language:reflectiveCalls"
)

libraryDependencies ++= Seq(
  "org.codemonkey.simplejavamail" % "simple-java-mail" % "2.1",
  //"play" %% "play" % "2.1.1",
  //"play" %% "play-test" % "2.1.1",
  "com.typesafe.play" %% "play" % "2.2.4",
  "com.typesafe.play" %% "play-test" % "2.2.4",
  "org.specs2" %% "specs2" % "1.7.1" % "test",
  "junit" % "junit" % "4.8" % "test"
)
