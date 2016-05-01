package com.github.karlicoss.gradlestuff

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import com.android.build.gradle.api.BaseVariant
import groovy.transform.TypeChecked
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project

/*
    Just a sample plugin which does nothing but println project's variants to the terminal
 */
@TypeChecked
public class GradleDemoPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def BaseExtension android
        def Iterable<? extends BaseVariant> variants
        if (project.plugins.hasPlugin(AppPlugin)) {
            android = project.extensions.getByType(AppExtension)
            variants = android.getApplicationVariants()
        } else if (project.plugins.hasPlugin(LibraryPlugin)) {
            android = project.extensions.getByType(LibraryExtension)
            variants = android.getLibraryVariants()
        } else {
            throw new GradleException('You must apply Android application plugin or Android library plugin first!')
        }

        project.afterEvaluate {
            println "Variant names: ${variants.each {v -> v.name}}"
        }
    }
}
