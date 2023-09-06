pipeline {
    agent any
    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk8'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        parallel(
            a: {
                echo "This is branch a"
            },
            b: {
                echo "This is branch b"
            }
        )
        stage('second Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('third Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '*.txt'
        }
    }
}