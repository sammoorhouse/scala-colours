package moorhouse.sam

sealed trait Console{
  val code: String
}
object Console{
  def unapply(c: Console) = Some((c.code))
}

case class Reset(code: String = "\u001b[0m") extends Console

case class Black (code: String= "\u001b[0;30m"  )extends Console
case class Red  (code: String= "\u001b[0;31m"   )extends Console
case class Green (code: String = "\u001b[0;32m" )extends Console
case class Yellow(code: String  = "\u001b[0;33m")extends Console
case class Blue (code: String = "\u001b[0;34m"   )extends Console
case class Purple(code: String  = "\u001b[0;35m" )extends Console
case class Cyan (code: String  ="\u001b[0;36m"   )extends Console
case class White (code: String = "\u001b[0;37m"  )extends Console
case class BlackBold (code: String = "\u001b[1;30m" )extends Console
case class RedBold  (code: String ="\u001b[1;31m"   )extends Console
case class GreenBold (code: String = "\u001b[1;32m" )extends Console
case class YellowBold (code: String = "\u001b[1;33m")extends Console
case class BlueBold  (code: String ="\u001b[1;34m"  )extends Console
case class PurpleBold (code: String = "\u001b[1;35m")extends Console
case class CyanBold  (code: String ="\u001b[1;36m"  )extends Console
case class WhiteBold (code: String = "\u001b[1;37m" )extends Console
case class BlackUnderline(code: String  = "\u001b[4;30m")extends Console
case class RedUnderline(code: String  = "\u001b[4;31m")extends Console
case class GreenUnderline(code: String  = "\u001b[4;32m")extends Console
case class YellowUnderline(code: String  = "\u001b[4;33m")extends Console
case class BlueUnderline(code: String  = "\u001b[4;34m")extends Console
case class PurpleUnderline(code: String  = "\u001b[4;35m")extends Console
case class CyanUnderline(code: String  = "\u001b[4;36m")extends Console
case class WhiteUnderline(code: String  = "\u001b[4;37m")extends Console
case class BlackBackground(code: String  = "\u001b[40m")extends Console
case class RedBackground(code: String  = "\u001b[41m")extends Console
case class GreenBackground(code: String  = "\u001b[42m")extends Console
case class YellowBackground(code: String  = "\u001b[43m")extends Console
case class BlueBackground(code: String  = "\u001b[44m")extends Console
case class PurpleBackground(code: String  = "\u001b[45m")extends Console
case class CyanBackground(code: String  = "\u001b[46m")extends Console
case class WhiteBackground(code: String  = "\u001b[47m")extends Console
case class BlackBright (code: String = "\u001b[0;90m")extends Console
case class RedBright  (code: String ="\u001b[0;91m")extends Console
case class GreenBright (code: String = "\u001b[0;92m")extends Console
case class YellowBright(code: String  = "\u001b[0;93m")extends Console
case class BlueBright (code: String = "\u001b[0;94m")extends Console
case class PurpleBright(code: String  = "\u001b[0;95m")extends Console
case class CyanBright (code: String = "\u001b[0;96m")extends Console
case class WhiteBright (code: String = "\u001b[0;97m")extends Console
case class BlackBoldBright(code: String  = "\u001b[1;90m")extends Console
case class RedBoldBright(code: String  = "\u001b[1;91m")extends Console
case class GreenBoldBright(code: String  = "\u001b[1;92m")extends Console
case class YelloBoldBright(code: String  = "\u001b[1;93m")extends Console
case class BlueBoldBright(code: String  = "\u001b[1;94m")extends Console
case class PurpleBoldBright(code: String  = "\u001b[1;95m")extends Console
case class CyanBoldBright(code: String  = "\u001b[1;96m")extends Console
case class WhiteBoldBright(code: String  = "\u001b[1;97m")extends Console
case class BlackBackgroundBright(code: String  = "\u001b[0;100m")extends Console
case class RedBackgroundBright(code: String  = "\u001b[0;101m")extends Console
case class GreenBackgroundBright(code: String  = "\u001b[0;102m")extends Console
case class YellowBackgroundBright(code: String  = "\u001b[0;103m")extends Console
case class BlueBackgroundBright(code: String  = "\u001b[0;104m")extends Console
case class PurpleBackgroundBright(code: String  = "\u001b[0;105m")extends Console
case class CyanBackgroundBright(code: String  = "\u001b[0;106m")extends Console
case class WhiteBackgroundBright(code: String  = "\u001b[0;107m")extends Console

object scalacolours {
  def set(modes: moorhouse.sam.Console *) (n: => Unit) = modes.map((m: Console) => m match{
    case moorhouse.sam.Console(code) => {
      System.out.print(code)
      n
      System.out.print(Reset)
    }
  })
}

object sctest extends App{
  scalacolours.set(BlueBackgroundBright()){
    print("hello world")
  }
}