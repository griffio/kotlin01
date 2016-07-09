# Kotlin 01

[Kotlin](https://kotlinlang.org/) base project 1.0.3
[Spek](https://jetbrains.github.io/spek/)

``` groovy
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
