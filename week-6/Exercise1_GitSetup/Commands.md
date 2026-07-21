# Exercise 1: Git Setup and Local Repositories

This guide covers configuring Git, setting a default text editor, initializing a local repository, and committing your first file.

## Step-by-Step Commands

### 1. User Configurations
Set your name and email globally:
```bash
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```

### 2. Verify Configurations
Check your global configurations to confirm:
```bash
git config --list
```

### 3. Integrate Notepad++ as Default Editor
Set Notepad++ (or VS Code) as the default editor for Git commits:
```bash
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"
```
*Note: Ensure the path matches the install location of Notepad++ on your machine.*

### 4. Initialize Local Repository
Create and initialize the repository:
```bash
mkdir GitDemo
cd GitDemo
git init
```

### 5. Add a File and Commit
Create `welcome.txt` and make your first commit:
```bash
echo "Welcome to Git Version Control!" > welcome.txt
git add welcome.txt
git commit -m "Initial commit with welcome.txt"
```

### 6. Verify Status
Verify that the working tree is clean:
```bash
git status
```
