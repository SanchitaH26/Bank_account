pipeline {
    agent any

    stages {

        stage('Hello Stage') {
            steps {
                echo 'Hello from Jenkins Pipeline using Groovy'
            }
        }

        stage('Groovy Logic') {
            steps {
                script {
                    int a = 10
                    int b = 20
                    int sum = a + b
                    echo "Sum of a and b is: ${sum}"
                }
            }
        }

        stage('Environment Info') {
            steps {
                echo "Job Name: ${env.JOB_NAME}"
                echo "Build Number: ${env.BUILD_NUMBER}"
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully'
        }
        failure {
            echo 'Pipeline failed'
        }
    }
}
