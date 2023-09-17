running_set = [
    "task1": {
        stage ("task_2"){
            node('label_example1') {
                sh 'echo "Running integration tests 1"'
                sh 'sleep 10'
                sh 'echo "Running integration tests 1 end"'
            }
        }
    },
    "task2": {
        stage ("task_2"){
            node('label_example_2') {
                sh 'echo "Running integration tests 1"'
                sh 'sleep 20'
                sh 'echo "Running integration tests 1 end"'
            }
        }
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