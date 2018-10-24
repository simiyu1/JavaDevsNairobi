function copyEnvVarsToGradleProperties {
    GRADLE_PROPERTIES="gradle.properties"
    export GRADLE_PROPERTIES
    echo "Gradle Properties should exist at $GRADLE_PROPERTIES"

    if [ ! -f "$GRADLE_PROPERTIES" ]; then
        echo "Gradle Properties does not exist"

        echo "Creating Gradle Properties file..."
        touch $GRADLE_PROPERTIES

        echo "Writing ACCESS_TOKEN to gradle.properties..."
        echo "ACCESS_TOKEN=ACCESS_TOKEN" >> $GRADLE_PROPERTIES
    fi
}