pipeline {
    agent any

    stages {
        stage('getdemo') {
            steps {
            git clone 'https://github.com/latermonk/jenkins-springboot-cicd-demo.git'  ./}
        }

          stage('pack') {
            steps {
                sh "mvn clean package"
            }
        }

        stage('deploy project') {
            steps {
                sh "scp target/demo-0.0.1-SNAPSHOT.jar root@192.168.248.21:/usr/local"
                sshPublisher(publishers: [sshPublisherDesc(configName: 'deployer-server', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '/usr/local/deploy.sh', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])            }
        }
    }
}




