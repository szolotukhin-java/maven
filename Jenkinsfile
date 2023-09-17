running_set = [
    "task1": {
        sh 'echo "Running integration tests 1"'
        sh 'sleep 10'
        sh 'echo "Running integration tests 1 end"'
    },
    "task2": {
        sh 'echo "Running integration tests 2"'
        sh 'sleep 20'
        sh 'echo "Running integration tests 2 end"'
    },
    "task3": {
        sh 'echo "Running integration tests 3"'
        sh 'sleep 15'
        sh 'echo "Running integration tests 3 end"'
    },
    "task4": {
        sh 'echo "Running integration tests 4"'
        sh 'sleep 5'
        sh 'echo "Running integration tests 4 end"'
    }
]

pipeline {
    agent any
    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk8'
    }
    stages {
        stage('Run') {
            steps {
                script {
                    parallel(running_set)
                }
            }
        }
        stage('End') {
            steps {
                script {
                    echo "End"
                }
            }
        }
    }
}