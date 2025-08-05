import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25" apply false
    id("org.springframework.boot") version "3.5.4" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.2"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

allprojects{
    group = "com.codedrill"
    version = "0.0.1-SNAPSHOT"

    tasks.withType<JavaCompile>{
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    repositories {
        mavenCentral()
    }

}

subprojects{
    group = "com.codedrill"
    version = "0.0.1-SNAPSHOT"

    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "kotlin")

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

