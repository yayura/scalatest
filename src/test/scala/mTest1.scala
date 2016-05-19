/**
  * Created by yuriy.ya on 19.05.2016.
  */



import org.scalatest.{Matchers, FreeSpec, GivenWhenThen}

class MyTest extends FreeSpec with GivenWhenThen with Matchers{



  "mTest et" - {
    "Шляпная математика 5" in  {
        Given("Допустим Какаято шляпа")
        var num = 2+3
        When("Когда все ясно")
        Then("Тогда все должно быть понятно")
        num should be (5)
      info("-----Это типа работает")
       }
    "Шляпная математика 4" in {
      Given("Есть сумма 3+2")
    val num = 3+2
      When("Сложим и посмотрим")
      Then("Будет ли 4")
    num should be (5)
    }

    "Игнорирование шляпы 2" in {
      Given("Непонятно")
      val mtest1 = 4
      When("прибавим 1")
      val mtest2 = mtest1 + 1
      Then("Проверим что тут")
      mtest2 shouldNot be (mtest1)
    info("----------Это норма")}

  }
}




