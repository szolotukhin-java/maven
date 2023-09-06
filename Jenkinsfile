pipeline {
    agent any
    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk8'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn install > log.txt'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'log.txt', onlyIfSuccessful: true
        }
    }
}