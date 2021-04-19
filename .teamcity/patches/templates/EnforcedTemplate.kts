package patches.templates

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Template
import jetbrains.buildServer.configs.kotlin.v2018_1.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a template with id = 'EnforcedTemplate'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, Template({
    id("EnforcedTemplate")
    name = "EnforcedTemplate"
}))

