import scala.math._

def sqrtOfPerfectSquare(x: Int): Option[Int] = {
  val sqrt = math.sqrt(x)
  if (sqrt % 1 == 0)
    Some(sqrt.toInt)
  else
    None
}