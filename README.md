# UTPLab6
This project is made for 
#Branching policy
image here

#tips on git
1. New branches should branch from master

  - 'git checkout master'
  - 'git checkout -b feature/[MyFeatureName]'
  - 'git push --set-upstream feature/[MyFeatureName]'

2. You can now work on your code

  - do some changes
  - 'git status' (to see what is the state of things) 
  - 'git add .' (to stage all changes)
  - 'git commit -m "meaningful message on what changed"'
  - 'git push'

3. when feature is ready and tested, pull request should be made, since the purpose of this exercise was to use only console we can do it like this

  - make sure that your current code was pushed to repository:
    - 'git checkout feature/[MyFeatureName]'
    - 'git status' (if there are any messages here you need to resolve them and commit changes)
    - 'git push'
  - 'git request-pull -p releaseCandidate feature/[MyFeatureName]' (this will show you differences between your branch and releaseCandidate branch, see if it is ok, or mail it to someone to verify. Pull request to master would be made same way by with 'master releaseCandidate' instead)

4. After code is verified by other developers and all comments to the code are resolved, one can merge code (This will make releaseCandidate get all changes from feature/[MyFeatureName])

 - 'git checkout releaseCandidate'
 - 'git merge feature/[MyFeatureName]'

