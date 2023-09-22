name := """play-rest-template"""
organization := "com.example"

version := "1.0-SNAPSHOT"

// lazy val root = (project in file(".")).enablePlugins(PlayScala)
lazy val root = (project in file(".")).enablePlugins(PlayService, RoutesCompiler)

scalaVersion := "2.12.10"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
// play.sbt.routes.RoutesKeys.routesImport += "java.util.UUID"

