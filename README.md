# UTPLab6

This project is made for collage purpose, it is a simple server for pretty printing json and xml files.

#Tools used

1. Java (backend)
1. HTML + js (frontend)
1. Maven
1. Spark

#Branching policy

![alt text](https://github.com/tom356/UTPLab6/raw/master/docs/branching_policy.png "Logo Title Text 1")

1. Master
  - Here we keep stable version of application. When new version will be ready and tested it will be merged to here. All feature branches should be branched from Master
2. ReleaseCandidate
  - This is currently developed version of product, new features should be merged to this branch after they are tested. this branch will be merged to Master when all planned functionality is ready
3. Feature Branch
  - These are branches on which everyone should develop their features. Its a private branch and one can do anything with it. Feature will be merged to relase candidate after tests
4. Bugfix
  - Optional for this project. When a bug is found on feature branch bugfix branch should be opened to fix the bug and then it should be merge to feature branch.

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

