def gitDownload(repo)
{
  git "https://github.com/chodisettivijay/${repo}.git"                 
}

def mavenBuild()
{
  sh 'mvn package'
}
