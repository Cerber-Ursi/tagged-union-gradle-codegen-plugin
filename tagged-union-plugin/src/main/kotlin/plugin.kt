package ru.cerbe.gradle

import SourceClass
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.TaskAction

class TaggedUnionPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    target.tasks.register("generateUnions", GenerateUnionsTask::class.java)
  }
}

open class GenerateUnionsTask : DefaultTask() {

  @TaskAction
  fun smoke() {
    println(SourceClass::class.java.name)
  }

}