pipeline {
    agent any

    stages {
        stage('Add Two Numbers') {
            steps {
                script {
                    int a = 10
                    int b = 20
                    int sum = a + b

                    echo "First number: ${a}"
                    echo "Second number: ${b}"
                    echo "Sum = ${sum}"
                }
            }
        }
    }
}
