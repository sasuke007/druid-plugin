package com.github.sasuke007.druidplugin.services

import com.intellij.openapi.project.Project
import com.github.sasuke007.druidplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
