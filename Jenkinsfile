pipeline {
    agent any
    parameters {
        string(name: 'ARG_1', defaultValue: 'hello 1', description: 'What should I say?')
        string(name: 'ARG_2', defaultValue: 'hello 2', description: 'What should I say?')
        string(name: 'ARG_3', defaultValue: 'hello 3', description: 'What should I say?')
    }
    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk8'
    }
    stages {
       stage('para') {
           parallel {
               stage('Unit Tests') {
                   steps {
                       sh 'echo "Run 1"'

                       sh 'echo "End 1"'
                   }
               }
               stage('Functional Tests') {
                   steps {
                        sh 'echo "Run 2"'

                       sh 'echo "End 2"'
                   }
               }
               stage('Integration Tests') {
                   steps {
                        sh 'echo "Run 3"'

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