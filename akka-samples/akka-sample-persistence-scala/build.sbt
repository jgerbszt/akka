name := "akka-sample-persistence-scala"

version := "2.4.0-RC3"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.0-RC3",
  "com.typesafe.akka" %% "akka-persistence" % "2.4.0-RC3",
  "org.iq80.leveldb"            % "leveldb"          % "0.7",
  "org.fusesource.leveldbjni"   % "leveldbjni-all"   % "1.8"
)
