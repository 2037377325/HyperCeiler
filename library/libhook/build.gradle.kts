dependencies {
    api(libs.core)
    api(libs.fragment)
    api(libs.recyclerview)
    api(libs.coordinatorlayout)
    api(libs.constraintlayout) {
        exclude("androidx.appcompat", "appcompat")
    }

    api(libs.core.ktx)
    api(libs.expansion)
    compileOnlyApi(projects.library.hiddenApi)

    // libxposed API 101
    api(projects.library.xposedApi101)
    compileOnlyApi(libs.libxposed.api)
    api(libs.libxposed.service)

    api(libs.dexkit)
    api(libs.ezxhelper.core)
    api(libs.hiddenapibypass)
    api(libs.gson)
    api(libs.hyperfocusapi)
    api(libs.superlyricapi)
    api(libs.lunarcalendar)

    api(projects.library.processor)
    api(projects.library.common)
    annotationProcessor(projects.library.processor)

    // 显式添加 Xposed API 以解决编译错误
    compileOnly 'de.robv.android.xposed:api:82'
}
