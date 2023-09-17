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
        stage('Run-2') {
            steps {
                script {
                    parallel(running_set)
                }
            }
        }
    }
}