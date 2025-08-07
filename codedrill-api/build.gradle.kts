import org.springframework.boot.gradle.tasks.bundling.BootJar


dependencies {
    implementation(project(":codedrill-common"))
    implementation(project(":codedrill-domain"))
    implementation(project(":codedrill-infra"))

    // Security
    implementation("org.springframework.boot:spring-boot-starter-security:3.2.4")
    testImplementation("org.springframework.security:spring-security-test:6.2.3")

    // Swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.4.0")

    // Jackson
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")

    // Web & Validation
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.3")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.2.3")
}

tasks.named<BootJar>("bootJar") { archiveFileName.set("codedrill-backend.jar") }
tasks.named<Jar>("jar") { enabled = false }
