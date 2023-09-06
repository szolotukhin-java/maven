pipeline {
    agent any
    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk8'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn install | tee loge.txt'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'log.txt', onlyIfSuccessful: true
        }
    }
}