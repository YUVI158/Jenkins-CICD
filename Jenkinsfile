pipeline{
  agent any
  tools{
    maven 'Maven-3.9.2'
  }
  stages{
      stage('Build Maven Project'){
          steps{
            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/YUVI158/Jenkins-CICD']])
            sh 'mvn clean install'
          }

      }
      stage('Build Docker image'){
        steps{
            script{
                sh 'docker build -t yuvraj158/jenkinscicd .'
            }
        }
      }
    stage('Push Docker image to Docker Hub'){
      steps{
        script{
          withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
            sh 'docker login -u yuvraj158 -p ${dockerhubpwd}'
            sh 'docker push yuvraj158/jenkinscicd'
          }
        }
      }
    }
  }
}
