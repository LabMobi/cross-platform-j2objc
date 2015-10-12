# cross-platform-j2objc
Sample project which uses j2ObjC to translate Java to Objective-C


https://github.com/MobiSolutions/cross-platform-j2objc.git

J2ObjC gradle plugin: https://github.com/j2objc-contrib/j2objc-gradle (https://plugins.gradle.org/plugin/com.github.j2objccontrib.j2objcgradle)

J2ObjC homepage: http://j2objc.org/

####Command-line
__Clean project:__ “gradle shared:clean --stacktrace”

__Build project:__  “gradle shared:build shared:j2objcXcode”

__Complete build:__  “gradlew shared:build shared:j2objcXcode”