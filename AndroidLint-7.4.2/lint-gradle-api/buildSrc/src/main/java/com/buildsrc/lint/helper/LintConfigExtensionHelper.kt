package com.buildsrc.lint.helper

import org.gradle.api.Project
import  com.buildsrc.lint.extensions.LintConfigExtension

object LintConfigExtensionHelper {
    private const val NAME = "easeLintExt"

    fun apply(project: Project) {
        project.extensions.create(NAME, LintConfigExtension::class.java)
    }

    fun findLintConfigExtension(project: Project): LintConfigExtension {
        val target = project.extensions.getByName(NAME)
        return target as LintConfigExtension
    }
}