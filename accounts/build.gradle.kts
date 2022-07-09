import com.ivy.buildsrc.EventBus

apply<com.ivy.buildsrc.IvyPlugin>()

plugins {
    `android-library`
}

dependencies {
    implementation(project(":ui-common"))
    implementation(project(":data-model"))
    implementation(project(":temp-domain"))
    implementation(project(":screens"))
    implementation(project(":app-base"))
    implementation(project(":temp-persistence"))
    implementation(project(":ui-components-old"))

    EventBus()
}