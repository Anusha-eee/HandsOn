# Exercise 2: Git Branches and Merging

This guide covers creating branches, switching between them, committing on a branch, and merging changes back to the main branch.

## Step-by-Step Commands

### 1. Create a New Branch
Create a branch named `feature-login`:
```bash
git branch feature-login
```

### 2. Switch to the Branch
Switch to the newly created branch:
```bash
git checkout feature-login
# Alternatively in newer Git versions: git switch feature-login
```

### 3. Make Changes and Commit on Branch
Create a new file `login.js` and commit it:
```bash
echo "function login() { console.log('logged in'); }" > login.js
git add login.js
git commit -m "Add basic login logic"
```

### 4. Switch Back to Main Branch
Go back to the master (or main) branch:
```bash
git checkout master
```
*(Notice that `login.js` is no longer visible in your folder, as it only exists on the `feature-login` branch).*

### 5. Merge Branch
Merge the changes from `feature-login` back into `master`:
```bash
git merge feature-login
```

### 6. Delete the Branch (Optional Clean up)
Once merged, you can delete the branch safely:
```bash
git branch -d feature-login
```
