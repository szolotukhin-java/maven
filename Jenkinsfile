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
                       sh 'sleep 10'
                   }
               }
               stage('Functional Tests') {
                   steps {
                       sh 'sleep 20'
                   }
               }
               stage('Integration Tests') {
                   steps {
                       sh 'sleep 15'
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