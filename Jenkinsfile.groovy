pipeline {
    agent any

    environment {

        CRD = credentials('i1-root')
        BRANCH_NAME = sh(label: 'getBranchName', returnStdout: true, script: 'git rev-parse --abbrev-ref HEAD').trim()
            

    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo 'How are you?'
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