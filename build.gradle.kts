plugins {
    id("ksuto.java-library")
    id("ksuto.picture-enums")
}

group = "fr.ksuto.bot"
version = "1.0"

dependencies {
    api(libs.ksuto.peripherals)
    api(libs.ksuto.logger)
}
