package moorhouse.sam

object ScalaColours {

  sealed abstract class Console(val code: String)

  case object Reset extends Console("\u001b[0m")

  case object Black extends Console("\u001b[0;30m")

  case object Red extends Console("\u001b[0;31m")

  case object Green extends Console("\u001b[0;32m")

  case object Yellow extends Console("\u001b[0;33m")

  case object Blue extends Console("\u001b[0;34m")

  case object Purple extends Console("\u001b[0;35m")

  case object Cyan extends Console("\u001b[0;36m")

  case object White extends Console("\u001b[0;37m")

  case object BlackBold extends Console("\u001b[1;30m")

  case object RedBold extends Console("\u001b[1;31m")

  case object GreenBold extends Console("\u001b[1;32m")

  case object YellowBold extends Console("\u001b[1;33m")

  case object BlueBold extends Console("\u001b[1;34m")

  case object PurpleBold extends Console("\u001b[1;35m")

  case object CyanBold extends Console("\u001b[1;36m")

  case object WhiteBold extends Console("\u001b[1;37m")

  case object BlackUnderline extends Console("\u001b[4;30m")

  case object RedUnderline extends Console("\u001b[4;31m")

  case object GreenUnderline extends Console("\u001b[4;32m")

  case object YellowUnderline extends Console("\u001b[4;33m")

  case object BlueUnderline extends Console("\u001b[4;34m")

  case object PurpleUnderline extends Console("\u001b[4;35m")

  case object CyanUnderline extends Console("\u001b[4;36m")

  case object WhiteUnderline extends Console("\u001b[4;37m")

  case object BlackBackground extends Console("\u001b[40m")

  case object RedBackground extends Console("\u001b[41m")

  case object GreenBackground extends Console("\u001b[42m")

  case object YellowBackground extends Console("\u001b[43m")

  case object BlueBackground extends Console("\u001b[44m")

  case object PurpleBackground extends Console("\u001b[45m")

  case object CyanBackground extends Console("\u001b[46m")

  case object WhiteBackground extends Console("\u001b[47m")

  case object BlackBright extends Console("\u001b[0;90m")

  case object RedBright extends Console("\u001b[0;91m")

  case object GreenBright extends Console("\u001b[0;92m")

  case object YellowBright extends Console("\u001b[0;93m")

  case object BlueBright extends Console("\u001b[0;94m")

  case object PurpleBright extends Console("\u001b[0;95m")

  case object CyanBright extends Console("\u001b[0;96m")

  case object WhiteBright extends Console("\u001b[0;97m")

  case object BlackBoldBright extends Console("\u001b[1;90m")

  case object RedBoldBright extends Console("\u001b[1;91m")

  case object GreenBoldBright extends Console("\u001b[1;92m")

  case object YelloBoldBright extends Console("\u001b[1;93m")

  case object BlueBoldBright extends Console("\u001b[1;94m")

  case object PurpleBoldBright extends Console("\u001b[1;95m")

  case object CyanBoldBright extends Console("\u001b[1;96m")

  case object WhiteBoldBright extends Console("\u001b[1;97m")

  case object BlackBackgroundBright extends Console("\u001b[0;100m")

  case object RedBackgroundBright extends Console("\u001b[0;101m")

  case object GreenBackgroundBright extends Console("\u001b[0;102m")

  case object YellowBackgroundBright extends Console("\u001b[0;103m")

  case object BlueBackgroundBright extends Console("\u001b[0;104m")

  case object PurpleBackgroundBright extends Console("\u001b[0;105m")

  case object CyanBackgroundBright extends Console("\u001b[0;106m")

  case object WhiteBackgroundBright extends Console("\u001b[0;107m")


  def unapply(c: Console) = Some(c.code)

  def set(modes: Console*)(n: => Unit) = modes.map((m: Console) => {
    System.out.print(m.code)
    n
    System.out.print(Reset)
  })
}


object sctest extends App{

  import moorhouse.sam.ScalaColours._
  set(BlueBackgroundBright){
    print("hello world")
  }
}