name := "codehound"
organization := "io.wholock.codehound"

scalaVersion := "2.11.8"
libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

// Testing
libraryDependencies ++= Seq(
  "org.scalameta" %% "scalameta" % "3.3.1",
  "org.scalameta" %% "contrib" % "3.3.1",
  "org.scalactic" %% "scalactic" % "3.0.4",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

// Enable linter in console
scalacOptions in (Compile, console) += "-Xplugin:" + (packageBin in Compile).value
