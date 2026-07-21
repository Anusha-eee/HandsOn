# Exercise 3: Resolving Merge Conflicts

This guide explains how to simulate and resolve a merge conflict in Git.

## Step-by-Step Commands

### 1. Make a Change on Master
Modify line 1 of `welcome.txt` on the `master` branch and commit:
```bash
echo "Original greeting on master" > welcome.txt
git add welcome.txt
git commit -m "Set master message"
```

### 2. Create and Switch to a New Branch
Create a branch named `fix-greeting`:
```bash
git checkout -b fix-greeting
```

### 3. Modify welcome.txt on Branch
Modify the same file and commit:
```bash
echo "Hello from branch fix-greeting" > welcome.txt
git add welcome.txt
git commit -m "Update greeting on branch"
```

### 4. Switch to Master and Modify welcome.txt
Switch back to `master` and change the greeting to conflict:
```bash
git checkout master
echo "Welcome from master branch" > welcome.txt
git add welcome.txt
git commit -m "Update greeting on master"
```

### 5. Attempt Merge (Triggers Conflict)
Attempt to merge `fix-greeting` into `master`:
```bash
git merge fix-greeting
```
*Output: CONFLICT (content): Merge conflict in welcome.txt. Automatic merge failed; fix conflicts and then commit the result.*

### 6. Resolve the Conflict
Open `welcome.txt` in your editor. You will see markers:
```
<<<<<<< HEAD
Welcome from master branch
=======
Hello from branch fix-greeting
>>>>>>> fix-greeting
```
Edit the file to merge the two greeting versions, removing the markers:
```
Welcome from master and fix-greeting branch
```

### 7. Commit the Resolved Code
Stage and commit the resolution:
```bash
git add welcome.txt
git commit -m "Merge branch fix-greeting and resolve conflict"
```
