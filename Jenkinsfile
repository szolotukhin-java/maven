pipeline {
    agent any
    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk8'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn install | tee first-loge.txt'
            }
        }
        stage('second Build') {
            steps {
                sh 'mvn install | tee second-loge.txt'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '*.txt', onlyIfSuccessful: true
        }
    }
}