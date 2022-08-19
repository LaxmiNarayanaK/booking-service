pipeline {

  agent any

//   tools {
//         maven 'MAVEN_3.8.6'
//   }

  stages {

    stage('Checkout code'){
	
        steps {
		    echo  'Pulling..' + env.BRANCH_NAME
                
                git credentialsId: 'f2801aed-98de-4457-ac54-6eaac306ab2f', url: 'https://tools.publicis.sapient.com/bitbucket/scm/pmap/bookings-microservice.git', branch : env.BRANCH_NAME

		    }
	    }

    stage("Check Code Health") {
        
        steps {
               sh "mvn clean compile"
           }
        }
    }
} 

