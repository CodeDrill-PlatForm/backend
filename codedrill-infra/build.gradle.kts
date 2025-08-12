import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    implementation(project(":codedrill-common"))
    implementation("org.springframework.boot:spring-boot-starter")

    //JWT
    api("io.jsonwebtoken:jjwt-api:0.12.6")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.12.6")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.12.6")
}

tasks.named<BootJar>("bootJar") { enabled = false }
tasks.named<Jar>("jar") { enabled = true }
