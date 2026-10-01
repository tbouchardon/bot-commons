pluginManagement {
    includeBuild("../Bot Parent")
}

plugins {
    id("ksuto.settings")
}

rootProject.name = "bot-commons"

includeBuild("../Commons")
includeBuild("../Logger")
includeBuild("../Bot Peripherals")
includeBuild("../Bot Generator")
