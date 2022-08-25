package com.jpsanchez.core.utils

import org.json4s.CustomSerializer
import org.json4s.JsonAST.JString
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object LocalDateTimeSerializer extends CustomSerializer[LocalDateTime](format => (
  {
    case JString(d) => LocalDateTime.parse(d, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
    case _ => null
  },
  {
    case x: LocalDateTime => JString(x.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")))
  }
))
