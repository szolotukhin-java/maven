pipeline {
    agent any
    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk8'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn install --log-file first-loge-2.txt'
            }
        }
        stage('second Build') {
            steps {
                sh 'mvn install -log-file second-loge-2.txt'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '*.txt'
        }
    }
}