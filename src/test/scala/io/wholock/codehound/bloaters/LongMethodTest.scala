package io.wholock.codehound.bloaters

import org.scalatest.WordSpec
import scala.meta._


class LongMethodTest extends WordSpec {

  "LongMethod.evaluate" should {

    "return false if the method contains more than 15 lines." in {

      // Arrange
      val source =
        s"""
           |def sqrt
         """.stripMargin

    }

  }

}
