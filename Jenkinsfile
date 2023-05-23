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
//       stage('Build Docker image'){
//         steps{
//             script{
//                 sh 'docker build -t d21it185rajbapodra/cldcimage .'
//             }
//         }
//       }
//     stage('Push Docker image to Docker Hub'){
//       steps{
//         script{
//           withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
//             sh 'docker login -u d21it185rajbapodra -p ${dockerhubpwd}'
//
//             sh 'docker push d21it185rajbapodra/cldcimage'
//           }
//         }
//       }
    }
  }
}
