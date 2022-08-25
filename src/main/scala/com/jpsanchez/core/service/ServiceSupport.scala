package com.jpsanchez.core.service

import scala.concurrent.Future
import com.jpsanchez.core.exceptions.AppException

trait ServiceSupport[T] {
  def failed[T](message: String): Future[T] = Future.failed(throw new AppException(message))
}
