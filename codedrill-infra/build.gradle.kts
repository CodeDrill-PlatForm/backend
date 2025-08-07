import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    implementation(project(":codedrill-common"))
    implementation("org.springframework.boot:spring-boot-starter")
}

tasks.named<BootJar>("bootJar") { enabled = false }
tasks.named<Jar>("jar") { enabled = true }
