def call(String imageName, String imageTag) {
    echo "📦 This is building the Docker image"
    sh """
        docker build -t ${imageName}:${imageTag} -t ${imageName}:latest .
    """
}
