# Kotlin 01

[Kotlin](https://kotlinlang.org/) base project 1.1.4
[Kotlin Test](https://github.com/kotlintest/kotlintest)

~~~ groovy

plugins {
  id "application"
  id "org.jetbrains.kotlin.jvm" version "1.1.4"
}

project.ext.sourceCompatibility = "1.8"
project.ext.targetCompatibility = "1.8"

//Main is compiled to MainKt
project.mainClassName = "griffio.MainKt"

repositories {
  mavenCentral()
}

dependencies {
  //if JDK 8, you can use extended versions of the Kotlin standard library which
  // contain additional extension functions for APIs added in new JDK versions.
  compile(
      "org.jetbrains.kotlin:kotlin-stdlib-jre8:$kotlin_version"
  )

  testCompile(
      "io.kotlintest:kotlintest:$kotlin_test"
  )
}

task wrapper(type: Wrapper) {
  gradleVersion = '4.0'
}

~~~
