* Command to run:
    JAVA_HOME=/usr/lib/jvm/java-8-oracle ./gradlew  --rerun-tasks compileReleaseJavaWithJavac -Ptypecheck=true 
* Apparently, you should have fork = false if you use JDK 8, otherwise you get weird error
    * more evidence to support this: /L/repos/checker-framework/checker/examples/GradleExamples/GradleJava8Example
            if (targetJavaVersion.isJava7()) {
            compile.options.compilerArgs += ['-source', '7', '-target', '7']
            options.fork = true
            options.forkOptions.jvmArgs += ["-Xbootclasspath/p:${configurations.checkerFrameworkJavac.asPath}"]
        }
* Non-Fenum annotations should be compiled in advance and added to classpath.
* TODO jack and jill?
* @Target({METHOD,PARAMETER,LOCAL_VARIABLE,FIELD})
* TODO runtime retention?