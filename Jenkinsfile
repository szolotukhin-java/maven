pipeline {
    agent any
    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk8'
    }
    stages {
       stage('before') {
           steps {
               sh 'sleep 5'
           }
       }
       stage('para') {
           parallel {
               stage('Unit Tests') {
                   steps {
                       sh 'echo "Run 1"'
                       sh 'sleep 10'
                       sh 'echo "End 1"'
                   }
               }
               stage('Functional Tests') {
                   steps {
                        sh 'echo "Run 2"'
                       sh 'sleep 20'
                       sh 'echo "End 2"'
                   }
               }
               stage('Integration Tests') {
                   steps {
                        sh 'echo "Run 3"'
                       sh 'sleep 15'
                       sh 'echo "End 3"'
                   }
               }
           }
       }
       stage('after') {
           steps {
               sh 'sleep 5'
           }
       }
    }
}