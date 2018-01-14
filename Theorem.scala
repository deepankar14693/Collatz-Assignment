package edu.knoldus

class Theorem {
 def collatzTheorem(input: Int): List[Int] = {
  def checkInput(list: List[Int],input:Int): List[Int] = {
   if (!list.contains(input)) {
    if (input % 2 == 0) {
     checkInput(input :: list,input / 2)
    }
    else {
     checkInput(input :: list, (3 * input) + 1)
    }
   }
   else {
    list
   }
  }
  checkInput(Nil,input)
 }
}
