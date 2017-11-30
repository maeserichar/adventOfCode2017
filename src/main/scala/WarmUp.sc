sealed trait Button
case class A() extends Button
case class B() extends Button
case class Up() extends Button
case class Down() extends Button
case class Right() extends Button
case class Left() extends Button
case class Start() extends Button

case class Position(x: Int, y: Int)

case class Marker(mark: String, position: Position)

def ProcessMovements(combination: List[Button]): List[Marker] = {
  def ProcessMovementsInternal(combination: List[Button], current: Position, acc: List[Marker]): List[Marker] = {
    ???
  }

  ProcessMovementsInternal(combination, Position(0,0), List())
}