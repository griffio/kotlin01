# Kotlin 01

Gradle 3.0 supports [gradle-script-kotlin](https://github.com/gradle/gradle-script-kotlin)

[Kotlin](https://kotlinlang.org/) base project 1.0.3
[Spek](https://jetbrains.github.io/spek/)

~~~ groovy
plugins {
  id 'nebula.kotlin' version '1.0.3'
}

repositories {
  mavenCentral()
  maven {
    url "http://repository.jetbrains.com/all"
  }
}

dependencies {
  compile(
      "org.jetbrains.kotlin:kotlin-stdlib:${kotlin_version}"
      )

  testCompile(
      "junit:junit:${junit_version}",
      "org.jetbrains.kotlin:kotlin-test-junit:${kotlin_version}",
      "org.jetbrains.spek:spek:+"
      ) 
}
~~~

Plugins dsl is not supported yet in kotlin gradle scripts

~~~ kotlin

buildscript {

  repositories {
    gradleScriptKotlin()
  }

  dependencies {
    classpath(kotlinModule("gradle-plugin"))
  }
}

apply {
  plugin("kotlin")
  plugin<ApplicationPlugin>()
}

configure<ApplicationPluginConvention> {
  mainClassName = "MainKt"
}

repositories {
  gradleScriptKotlin()
}

dependencies {
  compile(kotlinModule("stdlib"))
  testCompile("org.jetbrains.spek:spek:+")
}

~~~