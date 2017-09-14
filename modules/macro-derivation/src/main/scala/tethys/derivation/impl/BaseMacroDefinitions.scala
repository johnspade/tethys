package tethys.derivation.impl

import scala.reflect.macros.blackbox

/**
  * Created by eld0727 on 22.04.17.
  */
trait BaseMacroDefinitions {
  val c: blackbox.Context
  import c.universe._

  lazy val pack = q"tethys"

  lazy val core = q"$pack.core"

  lazy val writersPack = q"$core.writers"

  lazy val readersPack = q"$core.writers"

  lazy val macroPack = q"$pack.derivation.impl"

  lazy val buildersPack = q"$pack.derivation.builder"

}