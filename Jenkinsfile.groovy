pipeline {
    agent any

    environment {

        CRD = credentials('i1-root')
        BRANCH_NAME = "${GIT_BRANCH.split("/")[1]}"
            

    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo 'How are you?'
                echo "${env.GIT_BRANCH}"
                echo "!!!! ${BRANCH_NAME}"
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