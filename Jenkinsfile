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
        sh 'exit 1'
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