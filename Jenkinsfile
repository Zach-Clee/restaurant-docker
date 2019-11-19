pipeline {
    agent any

    stages {
        stage('Testing Environment') {
            steps {
		echo "no tests available"
		}
            }
        stage('Build') {
            steps {
		sh 'mvn package -DskipTests'
		sh 'docker build -t="zachclee/restaurant-project:latest" .'
                }
            }
        stage('Deploy') {
            steps {
		echo "deploy"
		sh 'docker push zachclee/restaurant-project:latest'
            }
        }
    }
}

