import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    // AOP
    implementation("org.springframework.boot:spring-boot-starter-aop")

    // Jackson
    api("com.fasterxml.jackson.core:jackson-annotations:2.10.1")
    api("com.fasterxml.jackson.core:jackson-databind:2.13.5")
}

tasks.named<BootJar>("bootJar") { enabled = false }
tasks.named<Jar>("jar") { enabled = true }
