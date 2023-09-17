running_set = [
    "task1": {
        sh 'echo "Running integration tests 1"'
    },
    "task2": {
        sh 'echo "Running integration tests 2"'
    }
]

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
                        sh 'echo "Running unit tests"'
                    }
                }
                stage('Integration Tests') {
                    steps {
                        sh 'echo "Running integration tests"'
                    }
                }
                stage('Integration Tests 2') {
                    steps {
                        sh 'echo "Running integration tests"'
                    }
                }
            }
        }
        stage('third Build') {
             parallel {
                stage('Build 1') {
                    steps {
                        sh 'mvn clean install'
                    }
                }
                stage('Build 2') {
                    steps {
                        sh 'mvn clean install'
                    }
                }
            }
        }
        stage('Run-2') {
            steps {
                script {
                    parallel(running_set)
                }
            }
        }
    }
}