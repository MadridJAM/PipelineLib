def call(String script) {
  if (config.enabled) {
    def shStdout = sh returnStdout: true, script: "${script}"
    return shStdout
  } else {
    echo "Wont run action due configured settings"
    echo "pull request"
    return "Wont run action due configured settings"
  }
}
