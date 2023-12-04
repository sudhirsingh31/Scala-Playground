object Abstraction {

  def isEligible(name: String): Boolean = {
    val age = getAge(name)
    val gender = if (name == "XYZ") "M" else "F"

    if (age > 18 && gender == "M"){
      true
    } else {
      false
    }
  }

  def getAge(name: String): Int = name == "XYZ" ? 19 : 17
}
