pipeline {
    agent any

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
            steps {
                echo '$BRANCH_NAME'
            }
        }
        stage('Deployyyy') {
            steps {
                echo 'mu mu mu!'
            }
        }

    }
}