package edu.knoldus

import org.apache.log4j.Logger

object ImplementTheorem extends App {
 val col=new Theorem
 val log = Logger.getLogger(this.getClass)
 val number =21
 log.debug("your number is present in the list search for it " + col.collatzTheorem(number) + "\n")
}
