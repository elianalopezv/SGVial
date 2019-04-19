name := """SGVial"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies += guice

// https://mvnrepository.com/artifact/postgresql/postgresql
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.5"

// https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api
libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.1"


libraryDependencies +="org.glassfish.jaxb" % "jaxb-core" % "2.3.0.1"
libraryDependencies +="org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2"


