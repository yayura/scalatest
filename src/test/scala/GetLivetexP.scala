/**
  * Created by yuriy.ya on 19.05.2016.
  */

import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{FreeSpec, Matchers}

import scala.io.Source

class GetLivetexP extends FreeSpec with Matchers with WebBrowser {


  val pageURL = "https://livetex.ru/"
  implicit val webDriver: WebDriver = new HtmlUnitDriver()

  def get(url: String) = Source.fromURL(url, "UTF-8").mkString

  "Get запрос страницы %s и проверка заголовка".format(pageURL) in {
    get(pageURL) should include("<title>\n    Омниканальная платформа для профессионального клиентского сервиса  </title>")
    info("ok")
  }


  "Открытие страницы " + pageURL + " и проверка заголовка" ignore {
    go to pageURL
    pageTitle should be("<title>\n    Омниканальная платформа для профессионального клиентского сервиса  </title>")
  }
  quit()
}

