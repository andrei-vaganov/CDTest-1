pipeline {
    agent none

    stages {
        stage('Hello') {
            agent {
                label 'instance1'
            }

            steps {
                echo 'Hello World'
                echo 'How are you?'
            }
        }
        
        stage('GGG') {
            agent any

            steps {
                echo 'mu mu mu!'
            }
        }
        stage('Deployyyy') {
            agent any

            steps {
                echo 'mu mu mu!'
            }
        }

    }
}