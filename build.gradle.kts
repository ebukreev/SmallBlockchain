import info.solidsoft.gradle.pitest.PitestPluginExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.serialization") version "1.8.10"
    application
    id("info.solidsoft.pitest") version "1.9.0"
    id("com.code-intelligence.cifuzz") version "1.0.0"
}

group = "dev.bukreev"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-network:2.2.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.0-Beta")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")
    implementation("org.slf4j:slf4j-simple:2.0.3")
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.5")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("junit:junit:4.13.1")
    testImplementation("net.jqwik:jqwik-kotlin:1.7.3")
    testImplementation("com.github.stefanbirkner:system-lambda:1.2.1")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

tasks.test {
    exclude(
        "**/fuzzing/**",
        "**/kex/**",
        "**/load/**",
        "**/stress/**",
        "**/system/**",
    )
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf(
            "-Xjsr305=strict",
            "-Xemit-jvm-type-annotations"
        )
        jvmTarget = "1.8"
        javaParameters = true
    }
}

application {
    mainClass.set("MainKt")
}

tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from (
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    )
    manifest {
        attributes["Main-Class"] = "dev.bukreev.smallblockchain.NodeRunnerKt"
    }
}

configure<PitestPluginExtension> {
    junit5PluginVersion.set("1.0.0")
    avoidCallsTo.set(setOf("kotlin.jvm.internal"))
    mutators.set(setOf("STRONGER"))
    targetClasses.set(setOf("dev.bukreev.*"))
    targetTests.set(
        setOf(
            "dev.bukreev.smallblockchain.integration.*",
            "dev.bukreev.smallblockchain.pbt.*",
            "dev.bukreev.smallblockchain.unit.*",
        )
    )
    threads.set(Runtime.getRuntime().availableProcessors())
}
