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
        stage('second Build') {
            parallel(
                stage('third Build 1') {
                    steps {
                        sh 'mvn clean install'
                    }
                }
                stage('third Build 2') {
                    steps {
                        sh 'mvn clean install'
                    }
                }
            )
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