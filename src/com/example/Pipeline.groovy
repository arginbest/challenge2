package com.example

class Pipeline {
    def script
    def configurationFile

    Pipeline(script, configurationFile) {
        this.script = script
        this.configurationFile = configurationFile
    }

    def execute() {
     stage('Read YAML file') {
        steps {
            script{ datas = readYaml (file: 'config.yml') }
            echo "hello"

        }
    }
}
//    ===================== Your Code Starts Here =====================
//    Note : use "script" to access objects from jenkins pipeline run (WorkflowScript passed from Jenkinsfile)
//           for example: script.node(), script.stage() etc

//    ===================== Parse configuration file ==================

//    ===================== Run pipeline stages =======================

//    ===================== End pipeline ==============================
    }
}
