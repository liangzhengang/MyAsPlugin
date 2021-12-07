package com.github.liangzhengang.myasplugin.services

import com.intellij.openapi.project.Project
import com.github.liangzhengang.myasplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
