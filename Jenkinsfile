pipeline {
    agent any

    environment {
        // Maven location
        MAVEN_HOME = "/opt/homebrew/Cellar/maven/3.9.11/libexec"
        PATH = "${env.MAVEN_HOME}/bin:/bin:/usr/bin"
    }

    stages {
        stage('Build & Test') {
            steps {
                // Change to your local project folder
                dir('/Users/lkjoshi/Desktop/IOSProject') {
                    // Use absolute path for sh and mvn
                    sh '/bin/sh -c "/opt/homebrew/bin/mvn clean test -f pom.xml"'
                }
            }
        }
    }

    post {
        always {
            // Publish TestNG results
            publishTestNGResults testResultsPattern: '**/target/surefire-reports/testng-results.xml'
        }
    }
}
