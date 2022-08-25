import org.scalatra.LifeCycle

import com.jpsanchez.core.model.{ Games, Genres }
import com.jpsanchez.core.rest.GameRest
import org.slf4j.{ Logger, LoggerFactory }

import javax.servlet.ServletContext
import com.jpsanchez.core.model.Autores
import com.jpsanchez.core.model.Frases
import com.jpsanchez.core.rest.AutorRest

class ScalatraBootstrap extends LifeCycle {

  private[this] val logger = LoggerFactory.getLogger(getClass)

  override def init(context: ServletContext) {
    logger.info("init resources ********")
    context.mount(new GameRest, "/game")
    context.mount(new AutorRest, "/autores")
  }

  private def createDB() = {
    logger.info("Criando tables")
    Genres.create
    Games.create
    Autores.create
    Frases.create
  }
}
