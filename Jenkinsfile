pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo 'How are you?'
            }
        }
        
        stage('GGG') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}, ${env.BRANCH_NAME}"
            }
        }
        stage('Deployyyy') {
            steps {
                echo 'mu mu mu!'
            }
        }

    }
}