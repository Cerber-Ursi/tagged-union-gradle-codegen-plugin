import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import java.nio.file.Files
import java.nio.file.Paths

internal class SourceClassTest {

  val sourceClass = parseClass(String(Files.readAllBytes(Paths.get(javaClass.getResource("fixtures/Simple.java")!!.toURI()))))

  @Test
  fun getClassName() {
    assertEquals(sourceClass.name, "Simple")
  }
}