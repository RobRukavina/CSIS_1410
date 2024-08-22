# CSIS_1410

If you are trying to use this repo for team work on a project, please follow the following steps. I will be your code review buddy spoken of in these instructions. You will need Git For Windows installed on your machine. Contact me first and we can get that setup if you don't already have it and know how to use it as there are specific settings that need to be checked during the install process.

# Code Review

Code reviewing a developer's code can take on many forms.

1. You can review the code and demo the functionality live, with a code review buddy
2. You can share code into the repo for the code reviewer to review when they can.

We will be doing the first of these workflows.

## Step-by-step guide with a Git-Buddy 👤👤!

#### Pro Tip :zap:

> If you start this process before you do an `add` command then you can use the UI tools and git bash window to very easily identify the pending changes in the working directory.

**_Assumptions_**

These instructions assume that you are on your own branch named `MY-BRANCH-NAME`. If you're not, these directions will run you in the wrong direction so be sure to start from your feature branch.

If you are not on your own branch, you should run this command while replacing MY-BRANCH-NAME with a name of your choosing. Remember that casing matters for this name. If you don't use the exact same casing throughout this process, you will end up on a different branch:

```bash
git checkout -b MY-BRANCH-NAME
```

> MY-BRANCH-NAME could be something like rob/theThingIamAWorkingOn

1. Get a buddy 👤👤 to do all the following steps with you:
   1. This is an interactive process so if you are the Buddy, you should ask questions and provide feedback about the code.
2. Run "Git Bash" or right click in your working directory folder and select open git bash here.
3. If you just run "Git Bash" without right clicking in working directory, you will need to `cd` into your working directory in your working/Branch.
4. Verify pending changes.

## Verify Changes

- Your buddy should review all your code changes with you.
- You should explain to your buddy what the code is doing and why.
- Verify that there are no errant changes to files that should not be modified.
- Verify all changes are meaningful and that you are not just committing white space.
- You should run :runner: your code and demonstrate a working product.

```bash
# View Pending Changes
git status
```

Add all current changes, i.e., stage untracked files and changes:

```bash
# Add current changes
git add -A
```

Commit changes with message:

```bash
# Commit changes
git commit -m 'meaningful messages of what you did'
```

Switch (or checkout) to main branch:

```bash
# switch to main (this is an extra step to try and keep things in an easier place to roll back from)
git checkout main
```

Get the last master code down to your machine:

```bash
# this will `fetch` and `merge` your master with the remote paster
git pull origin main
```

You should not have any messages that indicated a merge at this point.
If so, speak with an me until you know how to handle these situations.
Next we switch back to our branch:

```bash
git checkout MY-BRANCH-NAME
```

## Time to Merge

```bash
# merge the local main branch into my own
git merge main
```

At this point you may find yourself in a "Merge Situation".

This is where you need to manually examine the code files and ascertain why Git was able to decide which changes to incorporate.

---

## Time to Earn the Big Bucks :red_circle:

If you find yourself in a merge situation you have to be very careful to resolve all changes before moving forward.

Moving forward without resolving all the conflicts in every file will leave your code files in corrupted format.

- YOU MUST CONTINUE TO WORK THROUGH THIS WITHE A BUDDY 👤👤
- You and your buddy must inspect all conflicts and decide what code to adopt.
- Make note of these decisions.
- Using your UI tools resolve any conflicts in all files.
- Run/Test/Verify Your Code

**You are not done "merging" until your git bash command line is free of the "(xxxxxx | merging)".**

If you were prompted to merge, you will have to run the commands of `add` and `commit` to complete the merge process.

---

What happens next is determined by whether you had to merge.

In any instance though, you need to run all your development servers to make sure they at least spin up.

If you did NOT have to merge you can just run through the code again as a sanity pass and move on to the next steps.

**If you did have to merge**, you will have to treat this code base like it was brand new and give it a thorough walk-through by code review and demo, and run the code you expect to be working.

# Merge with Care​

Every time you go through a merge you have to take great care in testing your code.

The merge indicates that there are changes to your application.

Your application is your work product.

Examine it carefully.

You will have ample opportunities to double check, or triple check your work before you accept any merge requests.

Take every advantage to make sure you are not removing anyone's work.

```bash
# check status of files
git status
```

## Push to server

```bash
# push to server
git push origin HEAD
```

## Pull Request

It is now time to submit a pull request or PR

When you push to server, inside your bash terminal you will have a link that is created. Click on that link and then select open pr on the push you just made. This will open a pull request (pr) and I can then review it and merge. Once that is merged, your code will be reflected in the main branch and all will have access to it.
