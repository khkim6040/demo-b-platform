pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "demo-b-platform"

include(
    "platform-bom",
    "platform-catalog",
    "platform-http-starter",
)
