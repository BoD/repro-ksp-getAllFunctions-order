plugins {
  kotlin("jvm")
  id("com.google.devtools.ksp") version "2.0.21-1.0.26"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(project(":processor"))
  ksp(project(":processor"))

  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(17)
}
