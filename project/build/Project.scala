

import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val liftVersion = "2.3-M1"
  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "junit" % "junit" % "4.5" % "test->default",
    "org.scala-tools.testing" % "specs" % "1.6.1" % "test->default"
  ) ++ super.libraryDependencies
}
