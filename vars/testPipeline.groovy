def call(Map params) {
    pipeline {
        agent {
            node {
                label "${params.node}"
            }
        }
        stages {
            stage('stage 1') {
                steps {
                    sh "echo This is stage 1 for application ${params.application}"
                }
            }
            stage('stage 2') {
                steps {
                    sh "echo This is stage 2 for application ${params.application}"
                }
            }
            stage('stage 3') {
                steps {
                    sh "echo This is stage 3 for application ${params.application}"
                }
            }
        }
    }
}
