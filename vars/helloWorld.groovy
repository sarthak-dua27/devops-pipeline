// def call(){
//   sh "echo Hello World"
// }

// def call(String name, String dow){
//   sh "echo ${name} ____ ${dow}"  
// }

def call(Map config = [:]){
  sh "echo ${config.name} ____ ${config.dow}"  
}
