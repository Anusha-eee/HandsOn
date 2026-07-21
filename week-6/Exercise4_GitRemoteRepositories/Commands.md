# Exercise 4: Working with Remote Repositories

This guide covers linking a local Git repository to a remote repository (such as GitHub or GitLab) and syncing commits.

## Step-by-Step Commands

### 1. Create Remote Repository
Create a repository on GitHub (e.g. named `GitDemo`). Copy the repository URL (e.g., `https://github.com/username/GitDemo.git`).

### 2. Add Remote Origin
Link the local repository to the remote origin URL:
```bash
git remote add origin https://github.com/username/GitDemo.git
```

### 3. Verify Remote
Verify that the remote has been added correctly:
```bash
git remote -v
```

### 4. Push Commits to Remote
Push your master branch commits to the remote:
```bash
git push -u origin master
```
*Note: The `-u` flag sets the upstream tracking branch for future pushes/pulls.*

### 5. Pull Changes from Remote
Pull any updates made on the remote (such as an updated README) back to your local folder:
```bash
git pull origin master
```
