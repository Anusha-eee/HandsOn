# Exercise 5: Collaborating (Fork & PR Workflow)

This guide covers the standard workflow for collaborating on open-source projects or team repositories.

## Step-by-Step Workflow

### 1. Fork the Repository
Navigate to the repository you wish to contribute to on GitHub and click the **Fork** button to create a copy of the repository under your own account.

### 2. Clone the Forked Repository
Clone the forked repository to your local machine:
```bash
git clone https://github.com/your-username/repo-name.git
cd repo-name
```

### 3. Configure Upstream Remote
Track the original repository to sync updates:
```bash
git remote add upstream https://github.com/original-owner/repo-name.git
```

### 4. Create a Feature Branch
Always create a branch to implement changes:
```bash
git checkout -b my-new-feature
```

### 5. Commit and Push Changes
Commit your feature edits and push them to your fork:
```bash
git add .
git commit -m "Implement required feature changes"
git push origin my-new-feature
```

### 6. Open a Pull Request (PR)
Navigate to the original repository on GitHub. You should see a banner: *"Compare & pull request"*. Click the button, provide a detailed description of your changes, and submit the Pull Request for review!
