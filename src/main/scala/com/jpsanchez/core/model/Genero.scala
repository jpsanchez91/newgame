package com.jpsanchez.core.model

import java.time.LocalDateTime

case class Genero(id: Option[Long], nome: String,  registerDH: LocalDateTime = LocalDateTime.now)
