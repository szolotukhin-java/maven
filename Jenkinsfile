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
        stage('Test') {
            parallel {
                stage('Unit Tests') {
                    steps {
//                         sh 'sleep 5s'
                        sh 'echo "Running unit tests"'
                        // Add commands to run unit tests
                    }
                }
                stage('Integration Tests') {
                    steps {
                        sh 'echo "Running integration tests"'
                        // Add commands to run integration tests
                    }
                }
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