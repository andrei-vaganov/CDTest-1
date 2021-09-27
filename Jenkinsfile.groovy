pipeline {
    agent any

    environment {

        CRD = credentials('i1-root')
        BRANCH_NAME = "opopop"
            

    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo 'How are you?'
                ecco "${env.GIT_BRANCH}"
                sh 'printenv'
            }
        }
        
        stage('GGG') {
            steps {
                echo "!!!! ${BRANCH_NAME}"
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}, ${env.BRANCH_NAME}, ${env.CHANGE_AUTHOR}, ${env.CHANGE_TARGET}, ${env.CHANGE_BRANCH},"
            }
        }
        stage('Deployyyy') {
            steps {
                echo 'mu mu mu!'
            }
        }

    }
}