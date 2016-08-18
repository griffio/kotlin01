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