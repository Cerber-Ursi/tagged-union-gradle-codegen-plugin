import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import ru.cerbe.gradle.GenerateUnionsTask

class TaggedUnionPluginTest {
  @Test
  fun pluginAddsTask() {
    val project: Project = ProjectBuilder.builder().build()
    project.getPluginManager().apply("ru.cerbe.tagged-union")
    assertTrue(project.getTasks().getByName("generateUnions") is GenerateUnionsTask)
  }
}