import org.jboss.forge.roaster.Roaster

data class SourceClass(val name: String)

fun parseClass(code: String): SourceClass {
  val source = Roaster.parse(code)
  return SourceClass(
    name = source.getName()
  )
}