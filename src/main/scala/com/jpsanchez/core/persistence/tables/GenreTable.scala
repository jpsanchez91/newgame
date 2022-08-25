package com.jpsanchez.core.persistence.tables

import com.jpsanchez.core.persistence.tables.DataBaseConversions._
import slick.driver.MySQLDriver.api._
import com.jpsanchez.core.model.{ Genre }
import com.jpsanchez.core.model.Games

class GenreTable(tag: Tag) extends Table[Genre](tag, "genre") {
  def id = column[Option[Long]]("id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("genre_name")
  def * = (id, name) <> (Genre.tupled, Genre.unapply)
}
